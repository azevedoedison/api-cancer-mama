package com.azevedoedison.apicancermama.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
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
import com.azevedoedison.apicancermama.model.FaixaEtariaModel;
import com.azevedoedison.apicancermama.repository.FaixaEtariaRepository;

@SpringBootTest
public class FaixaEtariaServiceTest {
	
	private static final Long ID = 1L;
	private static final Long FAIXAI = 5L;
	private static final Long FAIXAN = 10L;
	private static final String DESCRICAO = "Entre 5 e 10 anos";
	private FaixaEtariaModel faixaEtaria;
	private FaixaEtariaModel faixaEtariaNoID;	
	private Optional<FaixaEtariaModel> optionalFaixaEtaria;
	@Mock
	private Pageable pageable;
	private Page<FaixaEtariaModel> page;
	
	private void startFaixaEtaria() {
		faixaEtaria = new FaixaEtariaModel(ID, FAIXAI, FAIXAN, DESCRICAO);
		faixaEtariaNoID = new FaixaEtariaModel(FAIXAI, FAIXAN, DESCRICAO);
		optionalFaixaEtaria = Optional.of(new FaixaEtariaModel(ID, FAIXAI, FAIXAN, DESCRICAO));
		pageable =  PageRequest.of(0, 2, Sort.by("id"));
		page = new PageImpl<>(List.of(faixaEtaria), pageable, 1);
	}
	
	@BeforeEach
	void setUp() {
		startFaixaEtaria();
		MockitoAnnotations.openMocks(this);
	}	

	@Autowired
	private FaixaEtariaService service;

	@MockBean
	private FaixaEtariaRepository repository;
		
	@Test
	public void whenFindALLThenReturnAPage() {		
	    //Moque pra mim que ao acessar o M??todo FindALL me retorne uma p??gina. 
		Mockito.when(repository.findAll(Mockito.any(Pageable.class))).thenReturn(page);		
				 	
		Page<FaixaEtariaModel> response = service.findAll(pageable);
				
		//Assegure pra mim que eu n??o vou receber um retorno nulo.
		Assertions.assertNotNull(response);			
		//Assegure pra mim que o total de elementos dispon??veis ?? igual ?? quantidade da lista.
		Assertions.assertEquals(1, response.getTotalElements());							
		//Assegure pra mim que ao pesquisar uma p??gina eu receba a implementa????o dessa p??gina
		Assertions.assertEquals(PageImpl.class, response.getClass());		
		//Assegure pra mim que a ordena????o da pagina????o est?? feita por ID
		Assertions.assertEquals(Sort.by("id"), response.getSort()); 		
		
	}
	
	@Test
	public void deleteSucess() {				
		service.delete(faixaEtaria);		
		verify(repository, times(1)).delete(faixaEtaria);
	}	
	
	
	@Test
	public void whenFindByIdThenReturnAnFaixaEtariaInstance(){
		Mockito.when(repository.findById(Mockito.anyLong())).thenReturn(optionalFaixaEtaria);
		
		Optional<FaixaEtariaModel> response = service.findById(ID);
		
		/*Me assegure que o response n??o ser?? nulo*/
		Assertions.assertNotNull(response);		
		/*Me Assegure que a faixa Etaria retornada tenha o mesmo ID que eu pesquisei*/
		Assertions.assertEquals(ID, response.get().getId());
		/*Me Assegure que a classe retornada ?? classe do tipo Optional*/
		Assertions.assertEquals(java.util.Optional.class, response.getClass());			
		 	
	}			
	
	@Test
	public void whenSaveThenReturnObject() {
		Mockito.when(repository.save(Mockito.any())).thenReturn(faixaEtariaNoID);				
		FaixaEtariaModel response = service.save(faixaEtariaNoID);
		
		/*Assegure pra mim que a resposta n??o ser?? nula*/
		Assertions.assertNotNull(response);		
		/*Assegure pra mim que a resposta ser?? uma Classe do tipo FaixaEtaria */
		Assertions.assertEquals(FaixaEtariaModel.class, response.getClass());		
		/*Assegure pra mim que a FaixaI ?? a mesma que eu passei*/
		Assertions.assertEquals(FAIXAI, response.getFaixaI());
		/*Assegure pra mim que a FaixaN ?? a mesma que eu passei*/
		Assertions.assertEquals(FAIXAN, response.getFaixaN());			
		/*Assegure pra mim que a Descri????o ?? a mesma que eu passei*/
		Assertions.assertEquals(DESCRICAO, response.getDescricao());
		
	}
	
	@Test
	public void whenExistsFaixaThenReturnTrue(){
		Mockito.when(repository.existsByFaixaIAndFaixaN(FAIXAI, FAIXAN)).thenReturn(true);
		
		Boolean response = service.existsByFaixa_iAndFaixa_n(FAIXAI, FAIXAN);
		
		/*Assegure pra mim que quando as faixas I e N existirem retornar?? true; */
		Assertions.assertTrue(response);
		
	}

}
