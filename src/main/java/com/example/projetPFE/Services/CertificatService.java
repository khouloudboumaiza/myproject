package com.example.projetPFE.Services;

import com.example.projetPFE.Modeles.CertificatRepository;
import com.example.projetPFE.classes.Affectation;
import com.example.projetPFE.classes.Certificat;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CertificatService {

    private CertificatRepository certificatRepository;

    public List<Certificat> getCertificat(){
        return certificatRepository.findAll();
    }

    public Optional<Certificat> getCertificatByID(Long id){
        return certificatRepository.findById(id);
    }
    public Certificat save(Certificat certificat){
        return certificatRepository.saveAndFlush(certificat);
    }

    public  boolean ExicteById(Long id){
        return certificatRepository.existsById(id);
    }

    public void DeleteCertificat(Long id){
       certificatRepository.deleteById(id);
    }

}
