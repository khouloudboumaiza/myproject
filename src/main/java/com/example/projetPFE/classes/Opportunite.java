package com.example.projetPFE.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;

import java.util.List;

@Table(name ="Formations")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Opportunite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Titre")
    private String Titre ;

    @Column(name = "Date_Deb")
    private Date Date_deb;

    @Column(name = "Date_Fin")
    private Date Date_fin;

    @Column(name = "Is_Actif")
    private String Is_Actif;

    @ManyToMany(mappedBy = "opportunite")
    private List<Consultant> consultants;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public Date getDate_deb() {
        return Date_deb;
    }

    public void setDate_deb(Date date_deb) {
        Date_deb = date_deb;
    }

    public Date getDate_fin() {
        return Date_fin;
    }

    public void setDate_fin(Date date_fin) {
        Date_fin = date_fin;
    }

    public String getIs_Actif() {
        return Is_Actif;
    }

    public void setIs_Actif(String is_Actif) {
        Is_Actif = is_Actif;
    }

    public List<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultants(List<Consultant> consultants) {
        this.consultants = consultants;
    }
}
