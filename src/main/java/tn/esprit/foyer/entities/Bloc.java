package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Bloc implements Serializable {

    @Id
    long idBloc;
    String nomBloc;
    long capaciteBloc;

}
