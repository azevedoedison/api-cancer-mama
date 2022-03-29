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
import com.azevedoedison.apicancermama.model.RegiaoModel;
import com.azevedoedison.apicancermama.repository.RegiaoRepository;

@SpringBootTest
public class RegiaoServiceTest {
	
	private static final Long ID = 1L;
	private static final String REGIAO = "Norte";
	private static final Long QNT_EXAME = null;
	private static final int TOTALEXAMES = 200;
	
	private RegiaoModel regiao;	
	private Optional<RegiaoModel> optionalRegiao;
	@Mock
	private Pageable pageable;
	private Page<RegiaoModel> page;
	
	private void startRegiao() {	
		regiao = new RegiaoModel(ID,REGIAO,QNT_EXAME,TOTALEXAMES);
		optionalRegiao = Optional.of(new RegiaoModel(ID,REGIAO,QNT_EXAME,TOTALEXAMES));
		pageable =  PageRequest.of(0, 2, Sort.by("id"));
		page = new PageImpl<>(List.of(regiao), pageable, 1);
	}
	
	@BeforeEach
	void setUp() {
		startRegiao();
		MockitoAnnotations.openMocks(this);
	}	

	@Autowired
	private RegiaoService service;

	@MockBean
	private RegiaoRepository repository;
		
	@Test
	public void whenFindALLThenReturnAPage() {	
		//Moque pra mim que ao acessar o Método FindALL me retorne uma página. 
		Mockito.when(repository.findAll(Mockito.any(Pageable.class))).thenReturn(page);	
				
		Page<RegiaoModel> response = service.findAll(pageable);
				
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
		Mockito.when(repository.findById(Mockito.anyLong())).thenReturn(optionalRegiao);
		
		Optional<RegiaoModel> response = service.findById(ID);
		
		/*Me assegure que o response não será nulo*/
		Assertions.assertNotNull(response);		
		/*Me Assegure que a faixa Etaria retornada tenha o mesmo ID que eu pesquisei*/
		Assertions.assertEquals(ID, response.get().getId());
		/*Me Assegure que a classe retornada é classe do tipo Optional*/
		Assertions.assertEquals(java.util.Optional.class, response.getClass());		
	}
	
	
	
	

}
