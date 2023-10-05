package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Foyer implements Serializable{

    @Id
    long idFoyer;
    String nomFoyer;
    long capaciteFoyer;
    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;

}
