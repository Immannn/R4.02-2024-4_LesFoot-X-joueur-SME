package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

public interface IServicesJoueur {

    public JoueurDTO ajouterJoueur(String nom, String pseudo, int annéeNaissance, Enum langue, String listeInteret) throws JoueurDejaExistantException, AnneeNaissanceInvalideException, FormatLangueInvalideException, CentresInteretVidesException, NomOuPseudoLongueurException, DoublonsCentresInteretException;


}
