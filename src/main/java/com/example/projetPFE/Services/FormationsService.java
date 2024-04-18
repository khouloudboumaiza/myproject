package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.FormationsRepository;
import com.example.projetPFE.classes.Experience;
import com.example.projetPFE.classes.Formations;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FormationsService {
    private FormationsRepository formationsRepository;

    public List<Formations> getFormations(){
        return formationsRepository.findAll();
    }

    public Optional<Formations> getFormationsById(Long id){
        return formationsRepository.findById(id);
    }

    public Formations save(Formations formations){
        return formationsRepository.saveAndFlush(formations);
    }

    public  boolean ExicteById(Long id){
        return formationsRepository.existsById(id);
    }

    public void DeleteFormations(Long id){
       formationsRepository.deleteById(id);
    }

}
