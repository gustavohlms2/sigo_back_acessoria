package br.com.springacessoria.pucsigo.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springacessoria.pucsigo.model.Contrato;
import br.com.springacessoria.pucsigo.repository.ContratoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Contratos")
public class ContratoController {
	
	@Autowired
	ContratoRepository contratoRepository;
	
	@ApiOperation(value="Retorna uma lista de Contratos")
	@GetMapping("/contrato")
	public List<Contrato> listaProdutos(){
		return contratoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um contrato unico")
	@GetMapping("/contrato/{id}")
	public Contrato listaProdutoUnico(@PathVariable(value="id") long id){
		return contratoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um contrato")
	@PostMapping("/contrato")
	public Contrato salvaProduto(@RequestBody @Valid Contrato contrato) {
		return contratoRepository.save(contrato);
	}
	
	@ApiOperation(value="Deleta um contrato")
	@DeleteMapping("/contrato")
	public void deletaProduto(@RequestBody @Valid Contrato contrato) {
		contratoRepository.delete(contrato);
	}
	
	@ApiOperation(value="Atualiza um contrato")
	@PutMapping("/contrato")
	public Contrato atualizaProduto(@RequestBody @Valid Contrato contrato) {
		return contratoRepository.save(contrato);
	}
	 

}
