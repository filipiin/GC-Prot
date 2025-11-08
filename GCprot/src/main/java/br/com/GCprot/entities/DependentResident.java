package br.com.GCprot.entities;

import br.com.GCprot.enums.ClassificationDependent;
import jakarta.persistence.*;

@Entity
@Table(name = "dependent_resident")
public class DependentResident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private ClassificationDependent classification;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "resident_id")
    private Resident resident;

    public DependentResident() {
    }

    public DependentResident(int id, Resident resident, Person person, ClassificationDependent classification) {
        this.id = id;
        this.classification = classification;
        this.resident = resident;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public ClassificationDependent getClassification() {
        return classification;
    }

    public void setClassification(ClassificationDependent classification) {
        this.classification = classification;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
