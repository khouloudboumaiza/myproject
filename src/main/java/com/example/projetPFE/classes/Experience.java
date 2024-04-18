package com.example.projetPFE.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@Table(name ="Experience")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name="Fonction")
    private String fonction;

    @Column(name="dateDeb")
    private Date date_Deb;

    @Column(name ="dateFin")
    private Date date_Fin;

    @Column(name = "Nom_societe")
    private  String Nom_Societe;

 @ManyToOne
 private Consultant consultant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Date getDate_Deb() {
        return date_Deb;
    }

    public void setDate_Deb(Date date_Deb) {
        this.date_Deb = date_Deb;
    }

    public Date getDate_Fin() {
        return date_Fin;
    }

    public void setDate_Fin(Date date_Fin) {
        this.date_Fin = date_Fin;
    }

    public String getNom_Societe() {
        return Nom_Societe;
    }

    public void setNom_Societe(String nom_Societe) {
        Nom_Societe = nom_Societe;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }
}
