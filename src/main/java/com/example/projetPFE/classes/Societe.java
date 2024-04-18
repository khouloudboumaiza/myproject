package com.example.projetPFE.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.List;

@Table(name ="Formations")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "Adresse")
    private String Adresse;

    @Column(name = "Contact")
    private String Contact;

    @Column(name="Email")
    private String Email;

    @Column(name = "Nom")
    private  String Nom;

    @Column(name = "Num_Siret")
    private  Number Num_Siret;

    @Column(name = "Num_tva")
    private Number Num_tva;

    @Column(name = "RTT")
    private String RTT;

    @Column(name = "Tel")
    private  String Tel;

    @OneToMany(mappedBy = "societe")
    private List<Consultant> consultants;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresse(){
        return Adresse;
    }

    public void  setAdresse(String adresse){
        this.Adresse=adresse;
    }

    public String getContact(){
        return Contact;
    }

    public void  setContact(String contact){
        this.Contact=contact;
    }

    public String getEmail(){
        return Email;
    }

    public void  setEmail(String email){
        this.Email=email;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Number getNum_Siret() {
        return Num_Siret;
    }

    public void setNum_Siret(Number num_Siret) {
        Num_Siret = num_Siret;
    }


    public Number getNum_tva() {
        return Num_tva;
    }

    public void setNum_tva(Number num_tva) {
        Num_tva = num_tva;
    }

    public String getRTT() {
        return RTT;
    }

    public void setRTT(String RTT) {
        this.RTT = RTT;
    }


    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public List<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultants(List<Consultant> consultants) {
        this.consultants = consultants;
    }
}
