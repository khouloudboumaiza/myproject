package com.example.projetPFE.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.List;

@Table(name ="Formations")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Formations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "Annee")
    private  int Annee;

    @Column(name = "Degree")
    private  int Degree;

    @Column(name = "Domain")
    private  String Domain;

    @Column(name = "Etablissement")
    private  String Etablissement;

    @Column(name = "Ville")
    private  String Ville ;

   @ManyToOne
   private Consultant consultant;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  int getAnnee(){
        return  Annee;
    }

    public  void setAnnee(int annee){
        this.Annee=annee;
    }

    public int getDegree(){
        return  Degree ;
    }

    public  void setDegree(int degree){
        this.Degree=degree;
    }

    public  String getDomain(){
        return  Domain;
    }

    public  void setDomain(String domaine){
        this.Domain=domaine;
    }

    public  String getEtablissement(){
        return  Etablissement;
    }

    public  void setEtablissement(String etablissement){
        this.Etablissement=etablissement;
    }

    public  String getVille(){
        return  Ville;
    }

    public  void setVille(String ville){
        this.Ville=ville;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }
}
