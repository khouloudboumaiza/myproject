package com.example.projetPFE.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Table(name ="Certificat")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Certificat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "Nom_Certificat")
    private  String Nom_Certificat;

    @ManyToOne
    private Consultant consultant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_Certificat() {
        return Nom_Certificat;
    }

    public void setNom_Certificat(String nom_Certificat) {
        Nom_Certificat = nom_Certificat;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }
}
