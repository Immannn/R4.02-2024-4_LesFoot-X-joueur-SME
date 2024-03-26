package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.Enum.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class ServicesJoueur implements IServicesJoueur {
    private static ServicesJoueur uniqueInstance = null;
    private ArrayList<JoueurDTO> joueursDTO;

    private ServicesJoueur() {
        this.joueursDTO = new ArrayList<>();
    }

    public static ServicesJoueur getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ServicesJoueur();
        }
        return uniqueInstance;
    }

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaissance, Langues langue, HashSet<String> centresInteret) throws JoueurDejaExistantException, AnneeNaissanceInvalideException, FormatLangueInvalideException, CentresInteretVidesException, NomOuPseudoLongueurException {
        if (joueursDTO.stream().anyMatch(joueur -> joueur.getPseudo().equals(pseudo))) {
            throw new JoueurDejaExistantException("Le pseudo choisi est déjà utilisé par un autre joueur.");
        }

        if (nom.length() < 3 || pseudo.length() < 3) {
            throw new NomOuPseudoLongueurException("Le nom et le pseudo doivent contenir au moins 3 caractères.");
        }

        if (anneeNaissance < 1900 || anneeNaissance > LocalDate.now().getYear()) {
            throw new AnneeNaissanceInvalideException("L'année de naissance " + anneeNaissance + " est invalide.");
        }

        if (langue == null) {
            throw new FormatLangueInvalideException("Le format de la langue est invalide.");
        }

        if (centresInteret == null || centresInteret.isEmpty()) {
            throw new CentresInteretVidesException("La liste des centres d'intérêt ne peut pas être vide.");
        }

        JoueurDTO nouveauJoueur = new JoueurDTO(nom, pseudo, anneeNaissance, langue, centresInteret);
        joueursDTO.add(nouveauJoueur);
        return nouveauJoueur;
    }
}
