package br.com.GCprot.repository;

import br.com.GCprot.entities.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Integer> {

}
