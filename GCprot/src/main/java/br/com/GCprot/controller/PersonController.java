// Spring Web: Permite que sua aplicação receba requisições da web (HTTP)
// É o que cria as "URLs" (endpoints) que seu frontend (um site em React, Angular, ou um aplicativo mobile) vai chamar.

// Você cria classes chamadas @RestController (Controladores)
// Dentro delas, você usa anotações como:
// @GetMapping (para buscar dados
// @PostMapping (para enviar dados).
package br.com.GCprot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.GCprot.services.PersonService;
import br.com.GCprot.entities.Person;

import java.util.List;

@RestController// Diz ao Spring que esta classe é um Controller REST
@RequestMapping("/person")// Todas as URLs deste controller começarão com /api/pessoas
public class PersonController {
    @Autowired // 1. Injeção de Dependência: Pede ao Spring uma instância do PessoaRepository
    private PersonService personService;

    @PostMapping // 2. Mapeia este metodo para r equisições HTTP POST em /api/pessoas
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return new ResponseEntity<>(personService.createPerson(person), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Person>> readPersonAll() {
        return new ResponseEntity<>(personService.readPersonAll(), HttpStatus.OK); // OK (200)
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> readPerson(@PathVariable int id) {
        return new ResponseEntity<>(personService.readPerson(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
        return new ResponseEntity<>(personService.updatePerson(person), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable int id) {
        return new ResponseEntity<>(personService.deletePerson(id), HttpStatus.NO_CONTENT);
    }
}

