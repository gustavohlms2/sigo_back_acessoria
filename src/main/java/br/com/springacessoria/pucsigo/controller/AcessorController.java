package br.com.springacessoria.pucsigo.controller;

import br.com.springacessoria.pucsigo.controller.dto.AcessorRq;
import br.com.springacessoria.pucsigo.controller.dto.AcessorRs;
import br.com.springacessoria.pucsigo.model.Acessor;
import br.com.springacessoria.pucsigo.repository.AcessorCustomRepository;
import br.com.springacessoria.pucsigo.repository.AcessorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/acessor")
public class AcessorController {

    private final AcessorRepository acessorRepository;
    private final AcessorCustomRepository acessorCustomRepository;

    public AcessorController(AcessorRepository acessorRepository, AcessorCustomRepository acessorCustomRepository) {
        this.acessorRepository = acessorRepository;
        this.acessorCustomRepository = acessorCustomRepository;
    }

    @CrossOrigin
    @GetMapping("/")
    public List<AcessorRs> findAll() {
        var acessors = acessorRepository.findAll();
        return acessors
                .stream()
                .map(AcessorRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public AcessorRs findById(@PathVariable("id") Long id) {
        var acessor = acessorRepository.getOne(id);
        return AcessorRs.converter(acessor);
    }

    @CrossOrigin
    @PostMapping("/")
    public void saveAcessor(@RequestBody AcessorRq p) {
        var n = new Acessor();
        n.setNome(p.getNome());
        n.setDescricao(p.getDescricao());
        n.setCpf(p.getCpf());
        n.setCnpj(p.getCnpj());
        n.setTelefone(p.getTelefone());
        n.setDataCriacao(p.getDataCriacao());
        n.setDataAlteracao(p.getDataAlteracao());
        n.setIndativo(p.getIndativo()); 
        acessorRepository.save(n);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody AcessorRq acessor) throws Exception {
        var p = acessorRepository.findById(id);

        if (p.isPresent()) {
            var acessorSave = p.get();
            acessorSave.setNome(acessor.getNome());
            acessorSave.setDescricao(acessor.getDescricao());
            acessorSave.setCpf(acessor.getCpf());
            acessorSave.setCnpj(acessor.getCnpj());
            acessorSave.setTelefone(acessor.getTelefone());
            acessorSave.setDataCriacao(acessor.getDataCriacao());
            acessorSave.setDataAlteracao(acessor.getDataAlteracao());
            acessorSave.setIndativo(acessor.getIndativo());  
            acessorRepository.save(acessorSave);      
        } else {
            throw new Exception("Acessor Não encontrada");
        }
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id ) throws Exception {
        var p = acessorRepository.findById(id);
        if (p.isPresent()) {
            acessorRepository.deleteById(id);        
        } else {
            throw new Exception("Acessor Não encontrada");
        }
    }

}
