package com.rd2s.projeto.resource;

import com.rd2s.projeto.model.Horarios;
import com.rd2s.projeto.repository.HorariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/horarios")
public class HorariosController {

    @Autowired
    private HorariosRepository repository;

    @GetMapping
    public List<HorariosDTO> getHorarios(){
        return repository.findAll().stream().map(p-> HorariosDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public HorariosDTO getHorariosId(@PathVariable(value = "id") Long horarioId) throws EntityNotFoundException {
        Horarios horarioFind = repository.findById(horarioId).orElseThrow(() -> new EntityNotFoundException("Horario não encontrado com ID :: " + horarioId));

        return HorariosDTO.toDTO(horarioFind);

    }

    @PostMapping
    public HorariosDTO create(@Valid @RequestBody Horarios horario) {

        return HorariosDTO.toDTO(repository.save(horario));

    }

    @PutMapping("/{id}")
    public Horarios update(@PathVariable(value = "id") Long horarioId, @RequestBody Horarios horario) throws EntityNotFoundException {
        Horarios horarioFind = repository.findById(horarioId).orElseThrow(() -> new EntityNotFoundException("Horarios não encontrado com ID:: " + horarioId));

        horarioFind.setId(horario.getId());
        horarioFind.setHora_Ini(horario.getHora_Ini());
        horarioFind.setHora_Fin(horario.getHora_Fin());

        return repository.save(horarioFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long horarioId) throws EntityNotFoundException {
        Horarios horarioFind = repository.findById(horarioId).orElseThrow(() -> new EntityNotFoundException("Horarios não encontrado com ID :: " + horarioId));

        repository.delete(horarioFind);

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
