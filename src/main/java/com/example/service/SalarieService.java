package com.example.service;

import com.example.javaClasses.salarie;
import com.example.javaClasses.salarieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalarieService implements SalarieServ{

    @Autowired
     salarieRepository salarieRepository ;


    @Override
    public List<salarie> findAll() {
        return salarieRepository.findAll();
    }

    @Override
    public salarie save(salarie salarie) {
        salarieRepository.save(salarie);
        return salarie;
    }

    @Override
    public salarie findById(int matricule) {
        if (salarieRepository.findById(matricule).isPresent()) {
            return salarieRepository.findById(matricule).get();
        }
        return null;
    }

    @Override
    public void delete(int matricule) {
        salarie salarie = findById(matricule) ;
        salarieRepository.delete(salarie);

    }

    @Override
    public salarie update(int matricule, salarie salarieUp) {
        salarie existingSalarie = findById(matricule);
        if (existingSalarie != null ) {
            existingSalarie.setMatricule(salarieUp.getMatricule());
            existingSalarie.setNom(salarieUp.getNom());
            existingSalarie.setPrenom(salarieUp.getPrenom());
            return salarieRepository.save(existingSalarie) ;
        }
        return null;
    }


}
