package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;


import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.impl.ServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.Enum.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

public class ServiceJoueurMockCentreInteretVideTest {

        private IServicesJoueur service;

        @Before
        public void setUp() {
            service = ServicesJoueur.getInstance();
            //service = new ServiceJoueurMockCentreInteretVide();
        }

        @Test(expected = CentresInteretVidesException.class)
        public void ajouterJoueurSansCentresInteret() throws CentresInteretVidesException, JoueurDejaExistantException, NomOuPseudoLongueurException, AnneeNaissanceInvalideException, FormatLangueInvalideException {
            service.ajouterJoueur("John Doe", "pseudo", 1990, Langues.Anglais, new HashSet<>());
        }
    }

