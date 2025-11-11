package br.com.GCprot.controller;

import br.com.GCprot.entities.DependentResident;
import br.com.GCprot.services.DependentResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dependent_resident")
public class DependentResidentController {

    @Autowired
    private DependentResidentService dependentResidentService;

    @PostMapping
    public ResponseEntity<DependentResident> createDependent(@RequestBody DependentResident dependent) {
        return new ResponseEntity<>(dependentResidentService.createDependent(dependent), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DependentResident>> readDependentAll() {
        return new ResponseEntity<>(dependentResidentService.readDependentAll(), HttpStatus.OK); // OK (200)
    }

    @GetMapping("/{id}")
    public ResponseEntity<DependentResident> readDependent(@PathVariable int id) {
        return new ResponseEntity<>(dependentResidentService.readDependent(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<DependentResident> updateDependent(@RequestBody DependentResident dependent) {
        return new ResponseEntity<>(dependentResidentService.updateDependent(dependent), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteDependent(@PathVariable int id) {
        return new ResponseEntity<>(dependentResidentService.deleteDependent(id),HttpStatus.NO_CONTENT);
    }
}
