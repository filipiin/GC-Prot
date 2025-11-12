package br.com.GCprot.controller;

import br.com.GCprot.entities.ResidentTitle;
import br.com.GCprot.services.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resident_title")
public class ResidentTitleController {

    @Autowired
    private TitleService titleService;

    @PostMapping("/{resident_id}/{title_id}")

    public ResponseEntity<ResidentTitle> matchResidentTitle(@PathVariable int resident_id, @PathVariable int title_id) {
        return new ResponseEntity<>(titleService.matchResidentTitle(resident_id, title_id), HttpStatus.CREATED);
    }
}
