package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;


public class ServiceJoueurMockNomOuPseudoLongueurTest {

    private ServiceJoueurMockNomOuPseudoLongueur service;

    @Before
    public void setUp() {
        service = new ServiceJoueurMockNomOuPseudoLongueur();
    }

    @Test(expected = NomOuPseudoLongueurException.class)
    public void ajouterJoueurAvecNomOuPseudoTropCourt() throws NomOuPseudoLongueurException{
        service.ajouterJoueur("Jo", "ps", 1990, null, new HashSet<>());
    }
}
