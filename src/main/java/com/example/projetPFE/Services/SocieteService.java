package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.SocieteRepository;
import com.example.projetPFE.classes.Opportunite;
import com.example.projetPFE.classes.Societe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SocieteService {
    private SocieteRepository societeRepository;
    public List<Societe> getSociete(){
        return societeRepository.findAll();
    }

    public Optional<Societe> getSocieteById(Long id){
        return societeRepository.findById(id);
    }

    public Societe save(Societe societe){
        return societeRepository.saveAndFlush(societe);
    }

    public  boolean ExicteById(Long id){
        return societeRepository.existsById(id);
    }

    public void DeleteSociete(Long id){
        societeRepository.deleteById(id);
    }

}
