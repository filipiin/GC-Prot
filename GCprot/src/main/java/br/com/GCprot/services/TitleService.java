package br.com.GCprot.services;

import br.com.GCprot.entities.*;
import br.com.GCprot.repository.TitleRepository;
import br.com.GCprot.repository.ResidentRepository;
import br.com.GCprot.repository.ResidentTitleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {

    @Autowired
    private TitleRepository titleRepository;
    @Autowired
    private ResidentTitleRepository residentTitleRepository;
    @Autowired
    private ResidentRepository residentRepository;

    public Title createTitle(Title title) {
        return titleRepository.save(title);
    }


    public Title updateTitle(Title titleUpdate) {
        Title title = titleRepository.findById(titleUpdate.getId())
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para atualizar"));
        title.setDescription(titleUpdate.getDescription());
        title.setSituation(titleUpdate.getSituation());

        return titleRepository.save(title);
    }

    @Transactional
    public boolean deleteTitle(int titleId) {
        Title title = titleRepository.findById(titleId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para deletar"));
        titleRepository.delete(title);
        return true;
    }

    public Title readTitle(int titleId) {
        Title title = titleRepository.findById(titleId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para ler"));
        return title;
    }

    public List<Title> readTitleAll() {
        return titleRepository.findAll();
    }

    public ResidentTitle matchResidentTitle(int resident_id, int title_id){
        Resident resident = residentRepository.findById(resident_id).orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para ler"));
        Title title = titleRepository.findById(title_id).orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para ler"));
        return residentTitleRepository.save(new ResidentTitle(resident, title));
    }
}

