package br.com.GCprot.services;

import br.com.GCprot.entities.Title;
import br.com.GCprot.repository.TitleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {

    @Autowired
    private TitleRepository titleRepository;

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
}

