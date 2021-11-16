package com.rd2s.projeto.resource;

import com.rd2s.projeto.model.Clientes;
import com.rd2s.projeto.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {
    @Autowired
    private ClientesRepository repository;

    @GetMapping
    public List<ClientesDTO> getClientes() {
        return repository.findAll().stream().map(p -> ClientesDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public ClientesDTO getPaisesId(@PathVariable(value = "id") Long clienteId) throws EntityNotFoundException {

        Clientes paisFind = repository.findById(clienteId)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID :: " + clienteId));

        return ClientesDTO.toDTO(paisFind);
    }


    @PostMapping
    public ClientesDTO create(@Valid @RequestBody Clientes cliente) {
        return ClientesDTO.toDTO(repository.save(cliente));
    }


    @PutMapping("/{id}")
    public ClientesDTO update(@PathVariable(value = "id") Long clienteId,
                            @RequestBody Clientes cliente) throws EntityNotFoundException {
        Clientes clienteFind = repository.findById(clienteId)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID :: " + clienteId));
        clienteFind.setId(cliente.getId());
        clienteFind.setNome(cliente.getNome());
        clienteFind.setEndereco(cliente.getEndereco());
        clienteFind.setCidade(cliente.getCidade());
        clienteFind.setBairro(cliente.getBairro());
        clienteFind.setTelefone(cliente.getTelefone());
        clienteFind.setCelular(cliente.getCelular());
        clienteFind.setEmail(cliente.getEmail());
        clienteFind.setCpf(cliente.getCpf());

        return ClientesDTO.toDTO(repository.save(clienteFind));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long clienteId) throws EntityNotFoundException {
        Clientes PaisFind = repository.findById(clienteId)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID :: " + clienteId));

        repository.delete(PaisFind);

        return ResponseEntity.noContent().build();
    }


}

