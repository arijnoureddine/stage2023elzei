package com.example.service;

import com.example.javaClasses.salarie;

import java.util.List;

public interface SalarieServ {
    List<salarie> findAll();
    salarie save ( salarie salarie);
    salarie findById (int matricule );
    void delete (int matricule);
    salarie update (int matricule , salarie updatedSalarie) ;



}
