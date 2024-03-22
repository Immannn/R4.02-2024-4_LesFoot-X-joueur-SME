package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;


import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.CentresInteretVidesException;

    public class ServiceJoueurMockCentreInteretVideTest {

        private ServiceJoueurMockCentreInteretVide service;

        @Before
        public void setUp() {
            service = new ServiceJoueurMockCentreInteretVide();
        }

        @Test(expected = CentresInteretVidesException.class)
        public void ajouterJoueurSansCentresInteret() throws CentresInteretVidesException {
            service.ajouterJoueur("John Doe", "pseudo", 1990, null, new HashSet<>());
        }
    }

