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

    @PostMapping
    public ResponseEntity<Unit> createUnit(@RequestBody Unit unit) {
        Unit newUnit = unitService.createUnit(unit);
        return new ResponseEntity<>(newUnit, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Unit>> readUnitAll() {
        List<Unit> unities = unitService.readUnitAll();
        return new ResponseEntity<>(unities, HttpStatus.OK); // OK (200)
    }

    @GetMapping("/{id}")
    public ResponseEntity<Unit> searchUnitById(@PathVariable int id) {
        Unit unit = unitService.readUnit(id);
        return new ResponseEntity<>(unit, HttpStatus.OK);
    }

    // --- Endpoint de ATUALIZAÇÃO (Update) ---
    // HTTP PUT -> http://localhost:8080/unidades
    @PutMapping
    public ResponseEntity<Unit> updateUnit(@RequestBody Unit unit) {
        //  @RequestBody: Pega o JSON com os dados da unidade para atualizar
        Unit unitUpdated = unitService.updateUnit(unit);
        return new ResponseEntity<>(unitUpdated, HttpStatus.OK);
    }

    // --- Endpoint de DELEÇÃO (Delete) ---
    // HTTP DELETE -> http://localhost:8080/unidades/5 (por exemplo)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUnit(@PathVariable int id) {
        //  @PathVariable: Pega o 'id' da URL para saber quem deletar
        unitService.deleteUnit(id);
        //  Para delete, não retornamos conteúdo (void) e status NO_CONTENT (204)
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}