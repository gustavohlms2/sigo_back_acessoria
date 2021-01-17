package br.com.springacessoria.pucsigo.controller;

import br.com.springacessoria.pucsigo.controller.dto.ContratoRq;
import br.com.springacessoria.pucsigo.controller.dto.ContratoRs;
import br.com.springacessoria.pucsigo.model.Contrato;
import br.com.springacessoria.pucsigo.repository.ContratoCustomRepository;
import br.com.springacessoria.pucsigo.repository.ContratoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/contrato")
public class ContratoController {

    private final ContratoRepository contratoRepository;
    private final ContratoCustomRepository contratoCustomRepository;

    public ContratoController(ContratoRepository contratoRepository, ContratoCustomRepository contratoCustomRepository) {
        this.contratoRepository = contratoRepository;
        this.contratoCustomRepository = contratoCustomRepository;
    }

    @CrossOrigin
    @GetMapping("/")
    public List<ContratoRs> findAll() {
        var contratos = contratoRepository.findAll();
        return contratos
                .stream()
                .map(ContratoRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ContratoRs findById(@PathVariable("id") Long id) {
        var contrato = contratoRepository.getOne(id);
        return ContratoRs.converter(contrato);
    }

    @CrossOrigin
    @PostMapping("/")
    public void saveContrato(@RequestBody ContratoRq contrato) {
        var n = new Contrato();
        n.setNome(contrato.getNome());
        n.setUrl(contrato.getUrl());
        n.setValor(contrato.getValor());
        n.setEmpresa(contrato.getEmpresa());
        n.setIdAcessor(contrato.getIdAcessor());
        n.setDescricao(contrato.getDescricao());
        n.setDataCriacao(contrato.getDataCriacao());
        n.setDataAlteracao(contrato.getDataAlteracao());
        n.setIndativo(contrato.getIndativo());
        contratoRepository.save(n);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody ContratoRq contrato) throws Exception {
        var p = contratoRepository.findById(id);

        if (p.isPresent()) {
            var contratoSave = p.get();
            contratoSave.setNome(contrato.getNome());
            contratoSave.setUrl(contrato.getUrl());
            contratoSave.setValor(contrato.getValor());
            contratoSave.setIdAcessor(contrato.getIdAcessor());
            contratoSave.setEmpresa(contrato.getEmpresa());
            contratoSave.setDescricao(contrato.getDescricao());
            contratoSave.setDataCriacao(contrato.getDataCriacao());
            contratoSave.setDataAlteracao(contrato.getDataAlteracao());
            contratoSave.setIndativo(contrato.getIndativo());
            contratoRepository.save(contratoSave);
        } else {
            throw new Exception("Contrato Não encontrada");
        }
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id ) throws Exception {
        var p = contratoRepository.findById(id);
        if (p.isPresent()) {
            contratoRepository.deleteById(id);        
        } else {
            throw new Exception("Contrato Não encontrada");
        }
    }

}
