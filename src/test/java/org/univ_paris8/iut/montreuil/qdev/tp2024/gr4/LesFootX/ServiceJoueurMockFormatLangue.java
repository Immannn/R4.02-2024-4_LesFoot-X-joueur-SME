package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import java.util.ArrayList;
import java.util.HashSet;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.Enum.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

public class ServiceJoueurMockFormatLangue implements IServicesJoueur {

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int annéeNaissance, Langues langue, HashSet<String> centreInteret) throws FormatLangueInvalideException{
        if (!(langue instanceof Langues)) {
            throw new FormatLangueInvalideException("Le format de la langue est invalide.");
        }

        return new JoueurDTO(nom, pseudo, annéeNaissance, langue, centreInteret);
    }
}