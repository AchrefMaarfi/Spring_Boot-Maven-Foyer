package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;
@Entity
public class Reservation implements Serializable {
    @Id
    String idReservation;
    Date anneeUniversitaire;
    boolean estValide;
}
