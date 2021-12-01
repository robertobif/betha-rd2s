package com.rd2s.projeto.resource;

import com.querydsl.core.types.Predicate;
import com.rd2s.projeto.model.Cidade;
import com.rd2s.projeto.repository.CidadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository repository;

    @GetMapping
    public List<CidadeDTO> getCidades(@QuerydslPredicate(root = Cidade.class) Predicate predicate) {
        List<CidadeDTO> result = new ArrayList<>();
        Iterable<Cidade> all = repository.findAll(predicate);
        all.forEach(f -> result.add(CidadeDTO.toDTO(f)));
        return result;
    }

    @GetMapping("/{id}")
    public CidadeDTO getCidadesId(@PathVariable(value = "id") Long cidadeId) throws EntityNotFoundException {
        Cidade cidadeFind = repository.findById(cidadeId).orElseThrow(() -> new EntityNotFoundException("Cidade não encontrado com ID :: " + cidadeId));

        return CidadeDTO.toDTO(cidadeFind);

    }

    @PostMapping
    public CidadeDTO create(@Valid @RequestBody Cidade cidade) {

        return CidadeDTO.toDTO(repository.save(cidade));

    }

    @PutMapping("/{id}")
    public Cidade update(@PathVariable(value = "id") Long cidadeId, @RequestBody Cidade cidade) throws EntityNotFoundException {
        Cidade cidadeFind = repository.findById(cidadeId).orElseThrow(() -> new EntityNotFoundException("Cidade não encontrado com ID:: " + cidadeId));

        cidadeFind.setId(cidade.getId());
        cidadeFind.setNome(cidade.getNome());
        cidadeFind.setPopulacao(cidade.getPopulacao());
        cidadeFind.setEstado(cidade.getEstado());

        return repository.save(cidadeFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long cidadeId) throws EntityNotFoundException {
        Cidade cidadeFind = repository.findById(cidadeId).orElseThrow(() -> new EntityNotFoundException("Cidade não encontrado com ID :: " + cidadeId));

        repository.delete(cidadeFind);

        return ResponseEntity.noContent().build();
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
