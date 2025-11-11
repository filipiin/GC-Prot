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

    public DependentResident createDependent(DependentResident dependent) {
        return dependentResidentRepository.save(dependent);
    }

    public DependentResident updateDependent(DependentResident dependent) {
        int dependentId = dependent.getId();
        DependentResident existingDependent = dependentResidentRepository.findById(dependentId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para atualizar"));
        existingDependent.setClassification(dependent.getClassification());
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

