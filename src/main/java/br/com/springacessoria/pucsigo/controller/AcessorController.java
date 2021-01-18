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

import br.com.springacessoria.pucsigo.model.Acessor;
import br.com.springacessoria.pucsigo.repository.AcessorRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Acessor")
public class AcessorController {
	
	@Autowired
	AcessorRepository acessorRepository;
	
	@ApiOperation(value="Retorna uma lista de Acessors")
	@GetMapping("/acessor")
	public List<Acessor> listaProdutos(){
		return acessorRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um acessor unico")
	@GetMapping("/acessor/{id}")
	public Acessor listaProdutoUnico(@PathVariable(value="id") long id){
		return acessorRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um acessor")
	@PostMapping("/acessor")
	public Acessor salvaProduto(@RequestBody @Valid Acessor acessor) {
		return acessorRepository.save(acessor);
	}
	
	@ApiOperation(value="Deleta um acessor")
	@DeleteMapping("/acessor")
	public void deletaProduto(@RequestBody @Valid Acessor acessor) {
		acessorRepository.delete(acessor);
	}
	
	@ApiOperation(value="Atualiza um acessor")
	@PutMapping("/acessor")
	public Acessor atualizaProduto(@RequestBody @Valid Acessor acessor) {
		return acessorRepository.save(acessor);
	}
	 

}
