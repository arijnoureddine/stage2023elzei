package com.example.controllers;


import com.example.javaClasses.salarie;
import com.example.service.SalarieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/salarie")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class salarieController {



    @Autowired
     SalarieService salarieService ;





    @PostMapping ("/salaries")
    public ResponseEntity<String> save (@RequestBody salarie salarie) {

        salarieService.save(salarie);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee saved successfully") ;

    }

    @GetMapping("/{matricule}")
    public salarie  get (@PathVariable("matricule") int matricule) {

        return salarieService.findById(matricule);
    }


    @PutMapping("/{matricule}")
    public ResponseEntity<String> updateSalarie(@PathVariable ("matricule") int matricule, @RequestBody salarie salarie) {

        salarie existingSalarie = salarieService.update(matricule,salarie);
        if (existingSalarie != null ) {

            return ResponseEntity.ok("Employee updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/salaries/{matricule}")
    public void deleteSalarie(@PathVariable ("matricule") int matricule) {

        salarieService.delete(matricule);
    }

    @ResponseBody
    @GetMapping("/salaries/all")
    public List<salarie> getAll()  {
        return   salarieService.findAll();
    }



}
