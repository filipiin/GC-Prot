package br.com.GCprot.controller;

import br.com.GCprot.entities.Occurrence;
import br.com.GCprot.services.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/occurrence")
public class OccurrenceController {

    @Autowired
    private OccurrenceService occurrenceService;

    @PostMapping
    public ResponseEntity<Occurrence> createOccurrence(@RequestBody Occurrence occurrence) {
        return new ResponseEntity<>(occurrenceService.createOccurrence(occurrence), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Occurrence> readOccurrence(@PathVariable(name = "id")int id) {
        return new ResponseEntity<>(occurrenceService.readOccurrence(id), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Occurrence>> readOccurrenceAll() {
        return new ResponseEntity<>(occurrenceService.readOccurrenceAll(), HttpStatus.OK);
    }
    @DeleteMapping("//{id}")
    public ResponseEntity<Boolean> deleteOccurrence(@PathVariable(name = "id")int id) {
        return new ResponseEntity<>(occurrenceService.deleteOccurrence(id), HttpStatus.OK);
    }
}
