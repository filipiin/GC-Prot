package br.com.GCprot.controller;

import br.com.GCprot.entities.Resident;
import br.com.GCprot.services.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resident")
public class ResidentController {

    @Autowired
    private ResidentService residentService;

    @PostMapping
    public ResponseEntity<Resident> createResident(@RequestBody Resident resident) {
        return new ResponseEntity<>(residentService.createResident(resident), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Resident>> readResidentAll() {
        return new ResponseEntity<>(residentService.readResidentAll(), HttpStatus.OK); // OK (200)
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resident> readResident(@PathVariable int id) {
        return new ResponseEntity<>(residentService.readResident(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteResident(@PathVariable int id) {
        return new ResponseEntity<>(residentService.deleteResident(id),HttpStatus.NO_CONTENT);
    }
}
