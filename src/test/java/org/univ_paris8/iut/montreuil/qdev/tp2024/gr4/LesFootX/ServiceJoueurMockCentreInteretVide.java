package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

import java.util.ArrayList;
import java.util.HashSet;

public class ServiceJoueurMockCentreInteretVide implements IServicesJoueur {

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int annéeNaissance, Enum langue, HashSet<String> centreInteret) throws  CentresInteretVidesException{
        if (centreInteret == null || centreInteret.isEmpty()) {
            throw new CentresInteretVidesException("La liste des centres d'intérêt ne peut pas être vide.");
        }

        return new JoueurDTO(nom, pseudo, annéeNaissance, langue, centreInteret);
    }
}


