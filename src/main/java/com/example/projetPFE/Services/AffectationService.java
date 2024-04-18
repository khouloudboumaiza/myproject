package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.AffectationRepository;
import com.example.projetPFE.classes.Affectation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AffectationService {

    private AffectationRepository affectationRepository;

    public List<Affectation> getAffectation(){
        return affectationRepository.findAll();
    }

    public Optional<Affectation> getAffectationByID(Long id){
        return affectationRepository.findById(id);
    }

    public Affectation save(Affectation affectation){
        return affectationRepository.saveAndFlush(affectation);
    }

    public  boolean ExicteById(Long id){
        return affectationRepository.existsById(id);
    }

    public void DeleteAffectation(Long id){
        affectationRepository.deleteById(id);
    }
}
