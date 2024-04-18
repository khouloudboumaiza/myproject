package com.example.projetPFE.Controller;

import com.example.projetPFE.Services.*;
import com.example.projetPFE.classes.*;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api")
public class Contoller {
    //Affectation contoller
    private AffectationService Affectationservice;

    @GetMapping("/Affectation")
    public List<Affectation> getAffectation(){
        return  Affectationservice.getAffectation();
    }


    @GetMapping("/Affectation/{id}")
    public Affectation getAffectation(@PathVariable Long id){
        return Affectationservice.getAffectationByID(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request affectation not found")
                );
    }

    @PostMapping("/Affectation")
    public Affectation AddAffectation(@RequestBody Affectation affectation){
        return Affectationservice.save(affectation);

    }

    @PutMapping("/Affectation/{id}") //updatebyid
    public ResponseEntity<?> AddAffectation (@RequestBody Affectation affectation , Long id){
        if(Affectationservice.ExicteById(id))
        {
            Affectation affectation1 = Affectationservice.getAffectationByID(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request affectation not found")
                    );
            affectation1.setDate_Deb(affectation.getDate_Deb());
            affectation1.setDate_Fin(affectation.getDate_Fin());
            affectation1.setTjm(affectation.getTjm());
            Affectationservice.save(affectation);
            return ResponseEntity.ok().body(affectation1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "affectation not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/Affectation/{id}") //deleteBYID
    public ResponseEntity<?> DeleteAffectation (@PathVariable Long id){
        if(Affectationservice.ExicteById(id))
        {
            Affectationservice.DeleteAffectation(id);
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "affectation not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    //CertificatContoller
    private CertificatService certificatService;

    @GetMapping("/Certificat")
    public List<Certificat> getCertificat(){
        return  certificatService.getCertificat();
    }

    @GetMapping("/Certificat/{id}")
    public Certificat getCertificat(@PathVariable Long id){
        return certificatService.getCertificatByID(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request affectation not found")
                );
    }

    @PostMapping("/Certificat")
    public Certificat AddCertificat(@RequestBody Certificat certificat){
        return certificatService.save(certificat);

    }

    @PutMapping("/Certificat/{id}") //updatebyid
    public ResponseEntity<?> AddCertificat (@RequestBody Certificat certificat , @PathVariable Long id){
        if(certificatService.ExicteById(id))
        {
            Certificat certificat1 = certificatService.getCertificatByID(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request certificat not found")
                    );

            certificat1.setNom_Certificat(certificat.getNom_Certificat());
            certificatService.save(certificat);
            return ResponseEntity.ok().body(certificat1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "certificat not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/Certificat/{id}") //deleteBYID
    public ResponseEntity<?> DeleteCertificat (@PathVariable Long id){
        if(certificatService.ExicteById(id))
        {
            certificatService.DeleteCertificat(id);

           HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {

           HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "certificat not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    //CompetenceContoller
    private CompetenceService competenceService ;

    @GetMapping("/Competence")
    public List<Competence> getCompetence(){
        return competenceService.getCompetence();
    }

    @GetMapping("/Competence/{id}")
    public Competence getCompetence(@PathVariable Long id){
        return competenceService.getCompetenceByID(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request competence not found")
                );
    }

    @PostMapping("/Competence")
    public Competence AddComptence(@RequestBody Competence competence){
        return competenceService.save(competence);

    }

    @PutMapping("/Competence/{id}") //updatebyid
    public ResponseEntity<?> AddCompetence (@RequestBody Competence competence ,@PathVariable Long id){
        if(competenceService.ExicteById(id))
        {
            Competence competence1 = competenceService.getCompetenceByID(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request competence not found")
                    );

            competence1.setNom_Competence(competence.getNom_Competence());
            competenceService.save(competence);
            return ResponseEntity.ok().body(competence1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "competence not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/comptence/{id}") //deleteBYID
    public ResponseEntity<?> DeleteComptence (@PathVariable Long id){
        if(competenceService.ExicteById(id))
        {
            competenceService.DeleteComptence(id);
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "competence not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

//ConsultantController
private ConsultantService consultantService;

    @GetMapping("/Consultant")
    public List<Consultant> getConsultant(){
        return consultantService.getConsultant();
    }

    @GetMapping("/Consultant/{id}")
    public Consultant getConsultant(@PathVariable Long id){
        return consultantService.getConsultantByID(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request consultant not found")
                );
    }

    @PostMapping("/Consultant")
    public Consultant AddConsultant(@RequestBody Consultant consultant){
        return consultantService.save(consultant);

    }

    @PutMapping("/Consultant/{id}") //updatebyid
    public ResponseEntity<?> AddConsultant (@RequestBody Consultant consultant , @PathVariable Long id){
        if(consultantService.ExicteById(id))
        {
            Consultant consultant1 = consultantService.getConsultantByID(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request consultant not found")
                    );

            consultant1.setFullName(consultant.getFullName());
            consultant1.setNom(consultant.getNom());
            consultant1.setPrenom(consultant.getPrenom());
            consultant1.setTel(consultant.getTel());
            consultant1.setIs_Commercial(consultant.getIs_Commercial());
            consultant1.setFonction(consultant.getFonction());
            consultant1.setType_Libelle(consultant.getType_Libelle());
            consultant1.setDate_sortie(consultant.getDate_sortie());
            consultant1.setDate_sortie(consultant.getDate_sortie());

            consultantService.save(consultant);
            return ResponseEntity.ok().body(consultant1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "consultant not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/consultant/{id}") //deleteBYID
    public ResponseEntity<?> DeleteConsultant (@PathVariable Long id){
        if(consultantService.ExicteById(id))
        {
            consultantService.DeleteConsultant(id);
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "consultant not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }


    //CVConsultantController
    private CVConsultantService cvConsultantService;

    @GetMapping("/CVConsultant")
    public List<CVConsultant> getCVConsultant(){
        return cvConsultantService.getCVConsultant();
    }

    @GetMapping("/CVConsultant/{id}")
    public CVConsultant getCVConsultant(@PathVariable Long id){
        return cvConsultantService.getCVConsultantByID(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request cvconsultant not found")
                );
    }

    @PostMapping("/CVConsultant")
    public CVConsultant AddCVConsultant(@RequestBody CVConsultant cvConsultant){
        return cvConsultantService.save(cvConsultant);

    }

    @PutMapping("/CVConsultant/{id}") //updatebyid
    public ResponseEntity<?> AddCVConsultant (@RequestBody CVConsultant cvConsultant , @PathVariable Long id){
        if(cvConsultantService.ExicteById(id))
        {
            CVConsultant cvConsultant1 = cvConsultantService.getCVConsultantByID(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request cvconsultant not found")
                    );

            cvConsultant1.setCV(cvConsultant.getCV());
            cvConsultant1.setFilename(cvConsultant.getFilename());
            cvConsultant1.setFonction(cvConsultant.getFonction());
            cvConsultant1.setFullname(cvConsultant.getFullname());
            cvConsultantService.save(cvConsultant);
            return ResponseEntity.ok().body(cvConsultant1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "cvconsultant not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/CVconsultant/{id}") //deleteBYID
    public ResponseEntity<?> DeleteCVConsultant (@PathVariable Long id){
        if(cvConsultantService.ExicteById(id))
        {
            cvConsultantService.DeleteCVConsultant(id);
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "cvconsultant not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    //ExpereinceContoller
    private ExperienceService experienceService;
    @GetMapping("/Experience")
    public List<Experience> getExperience(){
        return experienceService.getExperience();
    }

    @GetMapping("/Expeirence/{id}")
    public Experience getExperienceById(@PathVariable Long id){
        return experienceService.getExperienceById(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request experience not found")
                );
    }


    @PostMapping("/Experience")
    public Experience AddExperience(@RequestBody Experience experience){
        return experienceService.save(experience);

    }

    @PutMapping("/Experience/{id}") //updatebyid
    public ResponseEntity<?> AddExpereince (@RequestBody Experience experience , @PathVariable Long id){
        if(experienceService.ExicteById(id))
        {
           Experience experience1 = experienceService.getExperienceById(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request experience not found")
                    );

           experience1.setFonction(experience.getFonction());
           experience1.setDate_Deb(experience.getDate_Deb());
           experience1.setDate_Fin(experience.getDate_Fin());
           experience1.setNom_Societe(experience.getNom_Societe());
            experienceService.save(experience);
            return ResponseEntity.ok().body(experience1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "experience not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/Experience/{id}") //deleteBYID
    public ResponseEntity<?> DeleteExperience (@PathVariable Long id){
        if(experienceService.ExicteById(id))
        {
           experienceService.DeleteExperience(id);
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "Experience not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    //FormationsController

    private  FormationsService formationsService;

    @GetMapping("/Formations")
    public List<Formations> getFormations(){
        return formationsService.getFormations();
    }

    @GetMapping("/Formations/{id}")
    public Formations getFormationsById(@PathVariable Long id){
        return formationsService.getFormationsById(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request Formations not found")
                );
    }

    @PostMapping("/Formations")
    public Formations AddFormations(@RequestBody Formations formations){
        return formationsService.save(formations);

    }

    @PutMapping("/Formations/{id}") //updatebyid
    public ResponseEntity<?> AddFormations (@RequestBody Formations formations , @PathVariable Long id){
        if(formationsService.ExicteById(id))
        {
           Formations formations1 = formationsService.getFormationsById(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request formations not found")
                    );

           formations1.setDomain(formations.getDomain());
           formations1.setAnnee(formations.getAnnee());
           formations1.setDegree(formations.getDegree());
           formations1.setEtablissement(formations.getEtablissement());
           formations1.setVille(formations.getVille());

            formationsService.save(formations);
            return ResponseEntity.ok().body(formations1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "formations not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/Formations/{id}") //deleteBYID
    public ResponseEntity<?> DeleteFormations (@PathVariable Long id){
        if(formationsService.ExicteById(id))
        {
            formationsService.DeleteFormations(id);
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "formations not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    //OpportunitéController

    private OpportunitéService opportunitéService;
    @GetMapping("/Opportunite")
    public List<Opportunite> getOpportunite(){
        return opportunitéService.getOpportunte();
    }

    @GetMapping("/Opportunite/{id}")
    public Opportunite getOpportunitesById(@PathVariable Long id){
        return opportunitéService.getOpportuniteById(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request Opportunite not found")
                );
    }

    @PostMapping("/Opportunite")
    public Opportunite AddOpportunite(@RequestBody Opportunite opportunite){
        return opportunitéService.save(opportunite);

    }

    @PutMapping("/Opportunite/{id}") //updatebyid
    public ResponseEntity<?> AddOpportunite (@RequestBody Opportunite opportunite , @PathVariable Long id){
        if(opportunitéService.ExicteById(id))
        {
           Opportunite opportunite1 = opportunitéService.getOpportuniteById(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request opportunite not found")
                    );

          opportunite1.setDescription(opportunite.getDescription());
          opportunite1.setTitre(opportunite.getTitre());
          opportunite1.setDate_deb(opportunite.getDate_deb());
          opportunite1.setDate_fin(opportunite.getDate_fin());
          opportunite1.setIs_Actif(opportunite.getIs_Actif());

            opportunitéService.save(opportunite);
            return ResponseEntity.ok().body(opportunite1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "opportunité not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/Opportunite/{id}") //deleteBYID
    public ResponseEntity<?> DeleteOpportunite(@PathVariable Long id){
        if(opportunitéService.ExicteById(id))
        {
           opportunitéService.DeleteOpportunite(id);
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "opportunite not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    //SocieteCotroller

    private SocieteService societeService;

    @GetMapping("/Societe")
    public List<Societe> getSociete(){
        return societeService.getSociete();
    }

    @GetMapping("/Societe/{id}")
    public Societe getSocieteById(@PathVariable Long id){
        return societeService.getSocieteById(id).
                orElseThrow(
                        ()->new EntityNotFoundException("request Societe not found")
                );
    }


    @PostMapping("/Societe")
    public Societe AddSociete(@RequestBody Societe societe){
        return societeService.save(societe);

    }

    @PutMapping("/Societe/{id}") //updatebyid
    public ResponseEntity<?> AddSociete (@RequestBody Societe societe , @PathVariable Long id){
        if(societeService.ExicteById(id))
        {
           Societe societe1 = societeService.getSocieteById(id).
                    orElseThrow(
                            ()-> new EntityNotFoundException(" request Societe not found")
                    );

           societe1.setAdresse(societe.getAdresse());
           societe1.setContact(societe.getContact());
           societe1.setEmail(societe.getEmail());
           societe1.setNom(societe.getNom());
           societe1.setTel(societe.getTel());
           societe1.setRTT(societe.getRTT());
           societe1.setNum_tva(societe.getNum_tva());
           societe1.setNum_Siret(societe.getNum_Siret());

            societeService.save(societe);
            return ResponseEntity.ok().body(societe1);

        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "societe not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @DeleteMapping("/Societe/{id}") //deleteBYID
    public ResponseEntity<?> DeleteSociete(@PathVariable Long id){
        if(societeService.ExicteById(id))
        {
            societeService.DeleteSociete(id);
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "deleted successfully");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        else {
            HashMap<String , String> message = new HashMap<>();
            message.put("message" , id + "societe not found or matched");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

}
