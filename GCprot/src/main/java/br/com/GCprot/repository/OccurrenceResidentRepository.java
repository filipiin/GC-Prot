package br.com.GCprot.repository;

import br.com.GCprot.entities.OccurrenceResident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccurrenceResidentRepository extends JpaRepository<OccurrenceResident, Integer> {
}
