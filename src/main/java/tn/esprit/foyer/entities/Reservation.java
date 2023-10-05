package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Reservation implements Serializable {
    @Id
    String idReservation;
    Date anneeUniversitaire;
    boolean estValide;
    @ManyToMany
    private Set<Etudiant> etudiants;
}
