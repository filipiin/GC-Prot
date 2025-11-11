package br.com.GCprot.entities;
// Spring Data JPA(Java Persistence API)
// Ao criar classes Java (Ex: Pessoa.java) e as anota com @Entity.
// Isso diz ao JPA: "Esta classe representa uma tabela no banco".
// Você cria interfaces (Ex: PessoaRepository) que estendem JpaRepository
// O Spring Data JPA automaticamente cria os métodos para você (como save(), findById(), findAll(), etc.).

import br.com.GCprot.enums.TypeTitle;
import br.com.GCprot.enums.SituationTitle;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "title")

public class Title
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float value;
    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date vality; //Long ou int?

    @Enumerated(EnumType.STRING)
    private SituationTitle situation;

    @Enumerated(EnumType.STRING)
    private TypeTitle type;

    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;

    public Title() {
    }

    public Title(int id, float value, Date vality, String description, SituationTitle situation, TypeTitle type) {
        this.id = id;
        this.value = value;
        this.vality = vality;
        this.description = description;
        this.situation = situation;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public float getValue(){
        return value;
    }
    public void setValue(float value){
        this.value = value;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){ this.description = description; }
    public Date getVality(){
        return vality;
    }
    public void setVality(Date vality){
        this.vality = vality;
    }
    public SituationTitle getSituation(){
        return situation;
    }
    public void setSituation(SituationTitle situation){
        this.situation = situation;
    }
    public TypeTitle getType(){
        return type;
    }
    public void setType(TypeTitle type){
        this.type = type;
    }
}

