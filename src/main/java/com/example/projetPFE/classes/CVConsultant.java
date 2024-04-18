package com.example.projetPFE.classes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.List;

@Table(name ="CVConsultant")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CVConsultant {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
   @Column(name = "Fonction")
   private  String fonction ;
    @Column(name = "CV")
    private  String CV;
    @Column(name = "FileName")
    private String filename;
    @Column(name = "FullName")
    private String fullname ;

    @OneToOne(mappedBy = "cvconsultant")
    private Consultant consultants;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getFonction(){
        return  fonction;
    }

    public  void setFonction(String fonction){
        this.fonction=fonction;
    }

    public  String getCV(){
        return  CV;
    }

    public  void setCV(String CV){
        this.CV=CV;
    }


    public  String getFilename(){
        return  filename;
    }

    public  void setFilename(String Filename){
        this.filename=Filename;
    }

    public  String getFullname(){
        return  fullname;
    }

    public  void setFullname(String FullName){
        this.fullname=FullName;
    }

    public Consultant getConsultants() {
        return consultants;
    }

    public void setConsultants(Consultant consultants) {
        this.consultants = consultants;
    }
}
