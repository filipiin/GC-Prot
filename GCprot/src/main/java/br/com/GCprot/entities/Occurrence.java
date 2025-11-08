package br.com.GCprot.entities;

import br.com.GCprot.enums.TypeOccurrance;
import jakarta.persistence.*;
import org.hibernate.sql.Update;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "occurrence")

public class Occurrence {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private Date vality;
        private String description;
        private Instant createdAt;
        private Instant updatedAt;

        @Enumerated(EnumType.STRING)
        private TypeOccurrance type;


    public Occurrence() {
    }

    public Occurrence(int id, Date vality, TypeOccurrance type, String description, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.vality = vality;
        this.description = description;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Integer getId() {
        return id;
    }
        public String getDescription() {
        return description;
    }
        public void setDescription(String description) {
        this.description = description;
    }
        public TypeOccurrance getType() {
            return type;
        }
        public void setType(TypeOccurrance type) {
            this.type = type;
        }
        public Date getVality() {
            return vality;
        }
        public Instant getCreatedAt() {
            return createdAt;
        }
    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
