package br.com.GCprot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "occurrence_resident")

public class OccurrenceResident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "resident_id")
    private Resident resident;

    @ManyToOne
    @JoinColumn(name = "title_id")
    private Occurrence occurrence;

    private OccurrenceResident(){
    }

    private OccurrenceResident(int id, Resident resident, Occurrence occurrence){
        this.id = id;
        this.resident = resident;
        this.occurrence = occurrence;
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

    public Occurrence getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Occurrence occurrence) {
        this.occurrence = occurrence;
    }
}

