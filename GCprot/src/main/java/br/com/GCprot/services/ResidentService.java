package br.com.GCprot.services;

import java.util.List;

import br.com.GCprot.entities.Occurrence;
import br.com.GCprot.entities.OccurrenceResident;
import br.com.GCprot.entities.Resident;
import br.com.GCprot.repository.OccurrenceRepository;
import br.com.GCprot.repository.OccurrenceResidentRepository;
import br.com.GCprot.repository.ResidentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired; // Import necessário

import org.springframework.stereotype.Service; // Import necessário

@Service
public class ResidentService {

    @Autowired
    private ResidentRepository residentRepository;
    @Autowired
    private OccurrenceRepository occurrenceRepository;
    @Autowired
    private OccurrenceResidentRepository occurrenceResidentRepository;

    public Resident createResident(Resident newResident) {
        return residentRepository.save(newResident);
    }

    @Transactional
    public boolean deleteResident(int residentId) {
        Resident resident = residentRepository.findById(residentId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para deletar"));
        residentRepository.delete(resident);
        return true;
    }

    public Resident readResident(int residentId) {
        Resident resident = residentRepository.findById(residentId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para ler"));
        return resident;
    }


    public List<Resident> readResidentAll() {
        return residentRepository.findAll();
    }

    public OccurrenceResident matchOccurrenceResident(int resident_id, int occurrence_id){
        Resident resident = residentRepository.findById(resident_id).orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para ler"));
        Occurrence occurrence = occurrenceRepository.findById(occurrence_id).orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para ler"));
        return occurrenceResidentRepository.save(new OccurrenceResident(resident, occurrence));
    }
}