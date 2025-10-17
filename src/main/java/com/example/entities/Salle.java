package com.example.entities;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "salles")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private List<Machine> machines;

    public Salle() {
    }

    public Salle(String a1) {
        this.code = a1;
    }

    // Constructeurs, getters et setters

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

}
