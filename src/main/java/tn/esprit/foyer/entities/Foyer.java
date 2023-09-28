package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Foyer implements Serializable{

    @Id
    long idFoyer;
    String nomFoyer;
    long capaciteFoyer;

}
