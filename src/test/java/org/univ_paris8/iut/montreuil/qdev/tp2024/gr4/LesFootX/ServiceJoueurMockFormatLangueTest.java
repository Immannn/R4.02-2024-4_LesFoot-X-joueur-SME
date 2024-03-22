package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;


public class ServiceJoueurMockFormatLangueTest {

    private ServiceJoueurMockFormatLangue service;

    @Before
    public void setUp() {
        service = new ServiceJoueurMockFormatLangue();
    }

    @Test(expected = FormatLangueInvalideException.class)
    public void ajouterJoueurAvecLangueInvalide() throws FormatLangueInvalideException {
        service.ajouterJoueur("John Doe", "pseudoUnique", 1990, null, new HashSet<>());
    }
}
