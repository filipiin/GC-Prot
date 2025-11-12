package br.com.GCprot.controller;

import br.com.GCprot.entities.Unit;
import br.com.GCprot.services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @PostMapping//                                                              post(create -> {"/####"}), put(update), get(read, readll), delete(delete) ->>  postar(create), colocar(update), obter(read, readll), excluir(delete)
    public ResponseEntity<Unit> createUnit(@RequestBody Unit unit) {
        return new ResponseEntity<>(unitService.createUnit(unit), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Unit>> readUnitAll() {
        return new ResponseEntity<>(unitService.readUnitAll(), HttpStatus.OK); // OK (200)
    }

    @GetMapping("/{id}")// Os Get precisam e se tiver mais de um precisa diferencia-los EXCETO NO readAll mas read e update sim
    public ResponseEntity<Unit> readUnit(@PathVariable int id) {
        return new ResponseEntity<>(unitService.readUnit(id), HttpStatus.OK);
    }

    @PutMapping//O Put no update não precisa de mais nada
    public ResponseEntity<Unit> updateUnit(@RequestBody Unit unit) {
        return new ResponseEntity<>(unitService.updateUnit(unit), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteUnit(@PathVariable int id) {
        return new ResponseEntity<>(unitService.deleteUnit(id), HttpStatus.NO_CONTENT);
    }
}