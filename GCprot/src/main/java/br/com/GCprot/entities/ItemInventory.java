package br.com.GCprot.entities;

import br.com.GCprot.enums.SituationItem;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "item_inventory")
public class ItemInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int quantity;
    private float value;

    @Enumerated(EnumType.STRING)
    private SituationItem situation;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;



    public ItemInventory() {
    }


    public ItemInventory(int id, String name, String description, int quantity, SituationItem situation, float value, Inventory inventory) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.value = value;
        this.situation = situation;
        this.inventory = inventory;
    }
        public int getId () {
            return id;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public SituationItem getSituation () {
            return situation;
        }

        public void setSituation (SituationItem situation){
            this.situation = situation;
        }

        public String getDescription () {
            return description;
        }

        public void setDescription (String description){
            this.description = description;
        }

        public int getQuantity () {
            return quantity;
        }

        public void setQuantity ( int quantity){
            this.quantity = quantity;
        }

        public float getValue () {
            return value;
        }

        public void setValue ( float value){
            this.value = value;
        }

        public Inventory getInventory () {
            return inventory;
        }

        public void setInventory ( Inventory inventory){
            this.inventory = inventory;
        }


}