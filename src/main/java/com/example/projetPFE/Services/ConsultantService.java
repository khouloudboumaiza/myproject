package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.ConsultantRepository;
import com.example.projetPFE.classes.Competence;
import com.example.projetPFE.classes.Consultant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConsultantService {
    private ConsultantRepository consultantRepository;

    public List<Consultant> getConsultant(){
        return consultantRepository.findAll();
    }

    public Optional<Consultant> getConsultantByID(Long id){
        return consultantRepository.findById(id);
    }

    public Consultant save(Consultant consultant){
        return consultantRepository.saveAndFlush(consultant);
    }

    public  boolean ExicteById(Long id){
        return consultantRepository.existsById(id);
    }

    public void DeleteConsultant(Long id){
      consultantRepository.deleteById(id);
    }




}
