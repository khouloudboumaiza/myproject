package com.example.projetPFE.classes;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity

@Table(name ="Affectation", schema = "crudapi")

public class Affectation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "Date_Deb")
    private Date Date_Deb;

    @Column(name = "Date_Fin")
    private Date Date_Fin;

    @Column(name = "TJM")
    private String tjm;

    @ManyToOne
    private Consultant consultant;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate_Deb() {
        return Date_Deb;
    }

    public void setDate_Deb(Date date_Deb) {
        Date_Deb = date_Deb;
    }

    public Date getDate_Fin() {
        return Date_Fin;
    }

    public void setDate_Fin(Date date_Fin) {
        Date_Fin = date_Fin;
    }

    public String getTjm() {
        return tjm;
    }

    public Affectation() {
    }

    public void setTjm(String tjm) {
        this.tjm = tjm;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }
}
