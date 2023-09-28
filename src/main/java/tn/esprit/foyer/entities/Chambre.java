package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Chambre implements Serializable {

    @Id
    long idChambre;
    long numeroChambre;
    TypeChambre typeC;
}
