package br.com.GCprot.entities;

import br.com.GCprot.enums.Function;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float wage;
    private String description;

    @Enumerated(EnumType.STRING)
    private Function function;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;

    public Employee() {
    }

    public Employee(int id, float wage, Function function, String description, Person person) {
        this.id = id;
        this.wage = wage;
        this.function = function;
        this.description = description;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
         this.function = function;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

