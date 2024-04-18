package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.CompetenceRepository;
import com.example.projetPFE.classes.Certificat;
import com.example.projetPFE.classes.Competence;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CompetenceService {

    private CompetenceRepository competenceRepository;

    public List<Competence> getCompetence(){
        return competenceRepository.findAll();
    }

    public Optional<Competence> getCompetenceByID(Long id){
        return competenceRepository.findById(id);
    }

    public Competence save(Competence competence){
        return competenceRepository.saveAndFlush(competence);
    }
    public  boolean ExicteById(Long id){
        return competenceRepository.existsById(id);
    }

    public void DeleteComptence(Long id){
       competenceRepository.deleteById(id);
    }

}

