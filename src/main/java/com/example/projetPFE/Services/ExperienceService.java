package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.ExperienceRepository;
import com.example.projetPFE.classes.CVConsultant;
import com.example.projetPFE.classes.Experience;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ExperienceService {
    private ExperienceRepository experienceRepository;

    public List<Experience> getExperience(){
        return experienceRepository.findAll();
    }

    public Optional<Experience> getExperienceById(Long id){
        return experienceRepository.findById(id);
    }

    public Experience save(Experience experience){
        return experienceRepository.saveAndFlush(experience);
    }

    public  boolean ExicteById(Long id){
        return experienceRepository.existsById(id);
    }

    public void DeleteExperience(Long id){
       experienceRepository.deleteById(id);
    }



}
