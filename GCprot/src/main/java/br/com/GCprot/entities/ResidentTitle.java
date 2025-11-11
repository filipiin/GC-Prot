package br.com.GCprot.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "resident_title")

public class ResidentTitle {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne
        @JoinColumn(name = "resident_id")
        private Resident resident;

        @ManyToOne
        @JoinColumn(name = "title_id")
        private Title title;


    private ResidentTitle(){
    }

    private ResidentTitle(int id, Resident resident, Title title){
        this.id = id;
        this.resident = resident;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}

