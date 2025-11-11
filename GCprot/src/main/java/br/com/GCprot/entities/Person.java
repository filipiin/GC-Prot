// Spring Data JPA(Java Persistence API)
// Ao criar classes Java (Ex: Pessoa.java) e as anota com @Entity.
// Isso diz ao JPA: "Esta classe representa uma tabela no banco".
// Você cria interfaces (Ex: PessoaRepository) que estendem JpaRepository
// O Spring Data JPA automaticamente cria os métodos para você (como save(), findById(), findAll(), etc.).

package br.com.GCprot.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "person")

public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cpf;
    private String name;
    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date; //Long ou int?

    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;

    public Person() {
    }

    public Person(int id, String cpf, Date date, String name, String email) {
        this.id = id;
        this.cpf = cpf;
        this.date = date;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){ this.cpf = cpf; }
    public Date getDateOfBith(){
        return date;
    }
    public void setDateOfBith(Date dateOfBith){
        this.date = dateOfBith;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
