package br.com.GCprot.repository;

import br.com.GCprot.entities.DependentResident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface DependentResidentRepository extends JpaRepository<DependentResident, Integer> {
    }
