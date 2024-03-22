package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ServiceJoueurMockPseudoIdentique implements IServicesJoueur {

    private Set<String> pseudosUtilises = new HashSet<>();

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaissance, Enum langue, HashSet<String> centreInteret) throws JoueurDejaExistantException {
        if (pseudosUtilises.contains(pseudo)) {
            throw new JoueurDejaExistantException("Le pseudo choisi est déjà utilisé par un autre joueur.");
        }
        pseudosUtilises.add(pseudo);
        return new JoueurDTO(nom, pseudo, anneeNaissance, langue, centreInteret);
    }

}