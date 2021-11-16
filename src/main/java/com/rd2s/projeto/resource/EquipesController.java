package com.rd2s.projeto.resource;

import com.rd2s.projeto.model.Equipes;
import com.rd2s.projeto.model.Estado;
import com.rd2s.projeto.repository.EquipesRepository;
import com.rd2s.projeto.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/equipes")
public class EquipesController {
    @Autowired
    private EquipesRepository repository;

    @GetMapping
    public List<EquipesDTO> getEquipes() {
        return repository.findAll().stream().map(p -> EquipesDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public EquipesDTO getEquipesId(@PathVariable(value = "id") Long equipeId) throws EntityNotFoundException {

        Equipes equipesFind = repository.findById(equipeId)
                .orElseThrow(() -> new EntityNotFoundException("Equipe não encontrado com ID :: " + equipeId));

        return EquipesDTO.toDTO(equipesFind);
    }


    @PostMapping
    public EquipesDTO create(@Valid @RequestBody Equipes equipe) {
        return EquipesDTO.toDTO(repository.save(equipe));
    }


    @PutMapping("/{id}")
    public EquipesDTO update(@PathVariable(value = "id") Long equipeId,
                            @RequestBody Equipes equipe) throws EntityNotFoundException {
        Equipes equipeFind = repository.findById(equipeId)
                .orElseThrow(() -> new EntityNotFoundException("Equipe não encontrado com ID :: " + equipeId));
        equipeFind.setId(equipe.getId());
        equipeFind.setNome(equipe.getNome());
        equipeFind.setCliente(equipe.getCliente());
        return EquipesDTO.toDTO(repository.save(equipeFind));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long equipeId) throws EntityNotFoundException {
        Equipes EquipesFind = repository.findById(equipeId)
                .orElseThrow(() -> new EntityNotFoundException("Equipe não encontrado com ID :: " + equipeId));

        repository.delete(EquipesFind);

        return ResponseEntity.noContent().build();
    }


}

