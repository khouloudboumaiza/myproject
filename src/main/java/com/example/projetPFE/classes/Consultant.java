package com.example.projetPFE.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;

import java.util.List;

@Table(name ="Competence")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Consultant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "FullName" )
    private String FullName;

    @Column(name = "Nom" )
    private String Nom;

    @Column(name = "Prenom" )
    private String Prenom;

    @Column(name = "Tel" )
    private String Tel;

    @Column(name = "Fonction" )
    private String Fonction;

    @Column(name = "Is_Commercial" )
    private String Is_Commercial;

    @Column(name = "Type_Libelle" )
    private String Type_Libelle;

    @Column(name = "Date_rectrutement" )
    private Date Date_rectrument;

    @Column(name = "Date_sortie" )
    private Date Date_sortie;

    @OneToMany(mappedBy = "consultant")
    private List<Certificat> certificats;
    @ManyToMany
    private List<Competence>competence;

    @OneToMany(mappedBy = "consultant")
    private List<Affectation> affectations;

    @OneToOne
    @JoinColumn(name = "cv_consultant_id")
    private  CVConsultant cvconsultant;

    @OneToMany(mappedBy = "consultant")
    private List<Experience>experiences;

    @OneToMany(mappedBy = "consultant")
    private List<Formations>formations;

    @ManyToMany
    private List<Opportunite> opportunite;


    @ManyToOne
    private Societe societe;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getFonction() {
        return Fonction;
    }

    public void setFonction(String fonction) {
        Fonction = fonction;
    }

    public String getIs_Commercial() {
        return Is_Commercial;
    }

    public void setIs_Commercial(String is_Commercial) {
        Is_Commercial = is_Commercial;
    }

    public String getType_Libelle() {
        return Type_Libelle;
    }

    public void setType_Libelle(String type_Libelle) {
        Type_Libelle = type_Libelle;
    }

    public Date getDate_rectrument() {
        return Date_rectrument;
    }

    public void setDate_rectrument(Date date_rectrument) {
        Date_rectrument = date_rectrument;
    }

    public Date getDate_sortie() {
        return Date_sortie;
    }

    public void setDate_sortie(Date date_sortie) {
        Date_sortie = date_sortie;
    }


    public CVConsultant getCvconsultant() {
        return cvconsultant;
    }

    public void setCvconsultant(CVConsultant cvconsultant) {
        this.cvconsultant = cvconsultant;
    }

    public List<Competence> getCompetence() {
        return competence;
    }

    public void setCompetence(List<Competence> competence) {
        this.competence = competence;
    }



    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public List<Opportunite> getOpportunite() {
        return opportunite;
    }

    public void setOpportunite(List<Opportunite> opportunite) {
        this.opportunite = opportunite;
    }

    public List<Certificat> getCertificats() {
        return certificats;
    }

    public void setCertificats(List<Certificat> certificats) {
        this.certificats = certificats;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<Formations> getFormations() {
        return formations;
    }

    public void setFormations(List<Formations> formations) {
        this.formations = formations;
    }
}
