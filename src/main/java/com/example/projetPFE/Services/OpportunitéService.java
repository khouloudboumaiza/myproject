package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.OpportuniteRepository;
import com.example.projetPFE.classes.Formations;
import com.example.projetPFE.classes.Opportunite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OpportunitéService {
    private OpportuniteRepository opportuniteRepository;

    public List<Opportunite> getOpportunte(){
        return opportuniteRepository.findAll();
    }

    public Optional<Opportunite> getOpportuniteById(Long id){
        return opportuniteRepository.findById(id);
    }

    public Opportunite save(Opportunite opportunite){
        return opportuniteRepository.saveAndFlush(opportunite);
    }

    public  boolean ExicteById(Long id){
        return opportuniteRepository.existsById(id);
    }

    public void DeleteOpportunite(Long id){
        opportuniteRepository.deleteById(id);
    }


}
