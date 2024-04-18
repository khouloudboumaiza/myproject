package com.example.projetPFE.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.List;

@Table(name ="Competence")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "Nom_Competence")
    private  String Nom_Competence;

    @ManyToMany(mappedBy = "competence")
    private List<Consultant> consultants;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_Competence() {
        return Nom_Competence;
    }

    public void setNom_Competence(String nom_Competence) {
        Nom_Competence = nom_Competence;
    }

    public List<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultants(List<Consultant> consultants) {
        this.consultants = consultants;
    }
}
