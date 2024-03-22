package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

import java.util.ArrayList;
import java.util.HashSet;

public class ServiceJoueurMockAnneeNaissance implements IServicesJoueur {


    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int annéeNaissance, Enum langue, HashSet<String> centreInteret) throws AnneeNaissanceInvalideException {
        if (annéeNaissance < 1900 || annéeNaissance > java.time.Year.now().getValue()) {
            throw new AnneeNaissanceInvalideException("L'année de naissance " + annéeNaissance + " est invalide.");
        }

        return new JoueurDTO(nom, pseudo, annéeNaissance, langue, centreInteret);
    }
}

