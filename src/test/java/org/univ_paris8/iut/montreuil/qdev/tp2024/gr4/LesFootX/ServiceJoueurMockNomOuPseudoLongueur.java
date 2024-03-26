package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import java.util.ArrayList;
import java.util.HashSet;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.Enum.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

public class ServiceJoueurMockNomOuPseudoLongueur implements IServicesJoueur {

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int annéeNaissance, Langues langue, HashSet<String> centreInteret) throws NomOuPseudoLongueurException {
        if (nom.length() < 3 || pseudo.length() < 3) {
            throw new NomOuPseudoLongueurException("Le nom et le pseudo doivent contenir au moins 3 caractères.");
        }

        return new JoueurDTO(nom, pseudo, annéeNaissance, langue, centreInteret);
    }

}
