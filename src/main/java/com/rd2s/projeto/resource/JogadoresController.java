package com.rd2s.projeto.resource;


import com.rd2s.projeto.model.Jogadores;
import com.rd2s.projeto.repository.JogadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/jogadores")
public class JogadoresController {
    @Autowired
    private JogadoresRepository repository;

    @GetMapping
    public List<JogadoresDTO> getJogadores() {
        return repository.findAll().stream().map(p -> JogadoresDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public JogadoresDTO getJogadoresId(@PathVariable(value = "id") Long jogadorId) throws EntityNotFoundException {

        Jogadores paisFind = repository.findById(jogadorId)
                .orElseThrow(() -> new EntityNotFoundException("Jogadores não encontrado com ID :: " + jogadorId));

        return JogadoresDTO.toDTO(paisFind);
    }


    @PostMapping
    public JogadoresDTO create(@Valid @RequestBody Jogadores jogador) {
        return JogadoresDTO.toDTO(repository.save(jogador));
    }


    @PutMapping("/{id}")
    public JogadoresDTO update(@PathVariable(value = "id") Long jogadorId,
                            @RequestBody Jogadores jogador) throws EntityNotFoundException {
        Jogadores jogadorFind = repository.findById(jogadorId)
                .orElseThrow(() -> new EntityNotFoundException("Jogadores não encontrado com ID :: " + jogadorId));
        jogadorFind.setId(jogador.getId());
        jogadorFind.setNome(jogador.getNome());
        return JogadoresDTO.toDTO(repository.save(jogadorFind));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long jogadorId) throws EntityNotFoundException {
        Jogadores PaisFind = repository.findById(jogadorId)
                .orElseThrow(() -> new EntityNotFoundException("Jogadores não encontrado com ID :: " + jogadorId));

        repository.delete(PaisFind);

        return ResponseEntity.noContent().build();
    }


}
