package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces;


import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

import java.util.ArrayList;
import java.util.HashSet;

public interface IServicesJoueur {

    public JoueurDTO ajouterJoueur(String nom, String pseudo, int annéeNaissance, Enum langue, HashSet<String> centresInteret) throws JoueurDejaExistantException, AnneeNaissanceInvalideException, FormatLangueInvalideException, CentresInteretVidesException, NomOuPseudoLongueurException;


}