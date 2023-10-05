package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Entity
public class Universite implements Serializable {
    @Id
    long idUniversite;
    String nomUniversite;
    String adress;
    @OneToOne
    private Foyer foyer;
}
