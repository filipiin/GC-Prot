package br.com.GCprot.entities;

import br.com.GCprot.enums.TypeOccurrance;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.sql.Update;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "occurrence")

public class Occurrence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date vality;
    private String description;
    private String name;

    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;

    @Enumerated(EnumType.STRING)
    private TypeOccurrance type;


    public Occurrence() {
    }

    public Occurrence(int id, String name, Date vality, TypeOccurrance type, String description) {
        this.id = id;
        this.name = name;
        this.vality = vality;
        this.description = description;
        this.type = type;
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
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
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
}
