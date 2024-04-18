package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.CVConsultantRepository;
import com.example.projetPFE.classes.CVConsultant;
import com.example.projetPFE.classes.Consultant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CVConsultantService {
    private CVConsultantRepository cvConsultantRepository;

    public List<CVConsultant> getCVConsultant(){
        return cvConsultantRepository.findAll();
    }
    public Optional<CVConsultant> getCVConsultantByID(Long id){
        return cvConsultantRepository.findById(id);
    }

    public CVConsultant save(CVConsultant cvConsultant){
        return cvConsultantRepository.saveAndFlush(cvConsultant);
    }

    public  boolean ExicteById(Long id){
        return cvConsultantRepository.existsById(id);
    }


    public void DeleteCVConsultant(Long id){
       cvConsultantRepository.deleteById(id);
    }



}
