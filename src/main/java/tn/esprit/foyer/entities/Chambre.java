package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Chambre implements Serializable {

    @Id
    long idChambre;
    long numeroChambre;
    TypeChambre typeC;
    @ManyToOne
    Bloc bloc;
    @OneToMany
    private Set<Reservation> reservations;
}
