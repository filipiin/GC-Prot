package br.com.GCprot.repository;

import br.com.GCprot.entities.ResidentTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentTitleRepository extends JpaRepository<ResidentTitle, Integer> {
}
