package br.com.GCprot.controller;

import br.com.GCprot.entities.OccurrenceResident;
import br.com.GCprot.services.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/occurrence_resident")
public class OccurrenceResidentController {

    @Autowired
    private ResidentService residentService;

    @PostMapping("/{resident_id}/{occurrence_id}")
    public ResponseEntity<OccurrenceResident> matchResidentOccurrence(@PathVariable int resident_id, @PathVariable int occurrence_id) {
        return new ResponseEntity<>(residentService.matchOccurrenceResident(resident_id, occurrence_id), HttpStatus.CREATED);
    }
}