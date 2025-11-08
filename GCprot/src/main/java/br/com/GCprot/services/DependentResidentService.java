package br.com.GCprot.services;
import java.util.List;

import br.com.GCprot.entities.DependentResident;
import br.com.GCprot.repository.DependentResidentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired; // Import necessário
import org.springframework.stereotype.Service; // Import necessário

@Service
public class DependentResidentService {

    @Autowired
    private DependentResidentRepository dependentResidentRepository;

    public DependentResident createDependent(DependentResident newdependent) {
        return dependentResidentRepository.save(newdependent);
    }

    public DependentResident updateDependent(DependentResident dependentResident) {
        int dependentId = dependentResident.getId();
        DependentResident existingDependent = dependentResidentRepository.findById(dependentId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para atualizar"));
        existingDependent.setClassification(dependentResident.getClassification());
        existingDependent.setPerson(dependentResident.getPerson());
        existingDependent.setResident(dependentResident.getResident());
        return dependentResidentRepository.save(existingDependent);
    }


    @Transactional
    public boolean deleteDependent(int dependentId) {
        DependentResident dependent = dependentResidentRepository.findById(dependentId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para deletar"));
        dependentResidentRepository.delete(dependent);
        return true;
    }

    public DependentResident readDependent(int dependentId) {
        DependentResident dependent = dependentResidentRepository.findById(dependentId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para ler"));
        return dependent;
    }

    public List<DependentResident> readDependentAll() {
        return dependentResidentRepository.findAll();
    }
}

