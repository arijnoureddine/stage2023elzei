package com.example.javaClasses;


import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class salarie {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)

    @Column ( name ="Matricule")
    private int matricule ;

    @Column(name = "Nom")
    private String nom ;

    @Column (name = "Prénom")
    private String prenom ;

    public salarie(String nom , String prenom) {
        this.nom = nom;
        this.prenom = prenom ;
    }

    public salarie () {

    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


}
