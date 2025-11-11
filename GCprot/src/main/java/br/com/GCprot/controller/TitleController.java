package br.com.GCprot.controller;

import br.com.GCprot.entities.Title;
import br.com.GCprot.services.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/title")

public class TitleController {
    @Autowired
    private TitleService titleService;

    @PostMapping
    public ResponseEntity<Title> createTitle(@RequestBody Title title) {
        return new ResponseEntity<>(titleService.createTitle(title), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Title>> readTitleAll() {
        return new ResponseEntity<>(titleService.readTitleAll(), HttpStatus.OK); // OK (200)
    }

    @GetMapping("/{id}")
    public ResponseEntity<Title> readTitle(@PathVariable int id) {
        return new ResponseEntity<>(titleService.readTitle(id), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Boolean> deleteTitle(@PathVariable int id) {
        return new ResponseEntity<>(titleService.deleteTitle(id),HttpStatus.NO_CONTENT);
    }
}
