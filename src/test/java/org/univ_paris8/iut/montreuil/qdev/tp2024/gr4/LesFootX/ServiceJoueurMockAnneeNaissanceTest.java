package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.junit.Before;
import org.junit.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.AnneeNaissanceInvalideException;

import java.time.Year;
import java.util.HashSet;

import static org.junit.Assert.*;

public class ServiceJoueurMockAnneeNaissanceTest {

    private ServiceJoueurMockAnneeNaissance service;

    @Before
    public void setUp() {
        service = new ServiceJoueurMockAnneeNaissance();
    }

    @Test
    public void ajouterJoueurAvecAnneeValide() {
        int anneeCourante = Year.now().getValue();
        try {
            JoueurDTO joueur = service.ajouterJoueur("John Doe", "jd123", anneeCourante - 1, null, new HashSet<>());
            assertNotNull(joueur);
        } catch (AnneeNaissanceInvalideException e) {
            fail("Une AnneeNaissanceInvalideException ne devrait pas être levée pour une année valide.");
        }
    }

    @Test(expected = AnneeNaissanceInvalideException.class)
    public void ajouterJoueurAvecAnneeInvalide() throws AnneeNaissanceInvalideException {
        int anneeCourante = Year.now().getValue() + 1;
        service.ajouterJoueur("Jane Doe", "jd456", anneeCourante, null, new HashSet<>());
    }
}
