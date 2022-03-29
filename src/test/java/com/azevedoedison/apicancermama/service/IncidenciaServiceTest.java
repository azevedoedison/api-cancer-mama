package com.azevedoedison.apicancermama.service;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.azevedoedison.apicancermama.model.IncidenciaModel;
import com.azevedoedison.apicancermama.repository.IncidenciaRepository;

@SpringBootTest
public class IncidenciaServiceTest {
				
	private static final Long ID = 1L;
	private static final Integer REGIAO_ID = 1;
	private static final Integer MES = 5;
	private static final Long FAIXA_ID = 2L;
	private static final Integer QNT_EXAME = 4;
	
	private IncidenciaModel incidencia;	
	private Optional<IncidenciaModel> optionalIncidencia;
	@Mock
	private Pageable pageable;
	private Page<IncidenciaModel> page;
	
	private void startIncidencia() {	
		incidencia = new IncidenciaModel(ID,REGIAO_ID,MES,FAIXA_ID,QNT_EXAME);
		optionalIncidencia = Optional.of(new IncidenciaModel(ID,REGIAO_ID,MES,FAIXA_ID,QNT_EXAME));
		pageable =  PageRequest.of(0, 2, Sort.by("id"));
		page = new PageImpl<>(List.of(incidencia), pageable, 1);
	}
	
	@BeforeEach
	void setUp() {
		startIncidencia();
		MockitoAnnotations.openMocks(this);
	}	

	@Autowired
	private IncidenciaService service;

	@MockBean
	private IncidenciaRepository repository;
		
	@Test
	public void whenFindALLThenReturnAPage() {	
		//Moque pra mim que ao acessar o Método FindALL me retorne uma página. 
		Mockito.when(repository.findAll(Mockito.any(Pageable.class))).thenReturn(page);	
				
		Page<IncidenciaModel> response = service.findAll(pageable);
				
		//Assegure pra mim que eu não vou receber um retorno nulo.
		Assertions.assertNotNull(response);			
		//Assegure pra mim que o total de elementos disponíveis é igual à quantidade da lista.
		Assertions.assertEquals(1, response.getTotalElements());							
		//Assegure pra mim que ao pesquisar uma página eu receba a implementação dessa página
		Assertions.assertEquals(PageImpl.class, response.getClass());		
		//Assegure pra mim que a ordenação da paginação está feita por ID
		Assertions.assertEquals(Sort.by("id"), response.getSort()); 		
	}
	
	@Test
	public void whenFindByIDThenReturnAnInstanceOfRegiao() {	
		Mockito.when(repository.findById(Mockito.anyLong())).thenReturn(optionalIncidencia);
		
		Optional<IncidenciaModel> response = service.findById(ID);
		
		/*Me assegure que o response não será nulo*/
		Assertions.assertNotNull(response);		
		/*Me Assegure que a faixa Etaria retornada tenha o mesmo ID que eu pesquisei*/
		Assertions.assertEquals(ID, response.get().getId());
		/*Me Assegure que a classe retornada é classe do tipo Optional*/
		Assertions.assertEquals(java.util.Optional.class, response.getClass());		
	}
	
	
	
	

}
