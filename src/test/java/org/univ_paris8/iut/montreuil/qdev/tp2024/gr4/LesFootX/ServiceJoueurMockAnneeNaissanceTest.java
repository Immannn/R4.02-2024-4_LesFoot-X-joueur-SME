package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.junit.Before;
import org.junit.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.impl.ServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.Enum.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;

import java.time.Year;
import java.util.HashSet;

import static org.junit.Assert.*;

public class ServiceJoueurMockAnneeNaissanceTest {

    private IServicesJoueur service;

    @Before
    public void setUp() {
        service = ServicesJoueur.getInstance();
        //service = new ServiceJoueurMockAnneeNaissance();
    }

    @Test
    public void ajouterJoueurAvecAnneeValide() throws AnneeNaissanceInvalideException, CentresInteretVidesException, JoueurDejaExistantException, NomOuPseudoLongueurException, FormatLangueInvalideException {
        int anneeCourante = Year.now().getValue();
        HashSet<String> centresInteret = new HashSet<>();
        centresInteret.add("Football");
        JoueurDTO joueur = service.ajouterJoueur("John Doe", "jd123", anneeCourante - 1, Langues.Anglais, centresInteret);
        assertNotNull(joueur);
    }


    @Test(expected = AnneeNaissanceInvalideException.class)
    public void ajouterJoueurAvecAnneeInvalide() throws AnneeNaissanceInvalideException, CentresInteretVidesException, JoueurDejaExistantException, NomOuPseudoLongueurException, FormatLangueInvalideException {
        int anneeCourante = Year.now().getValue() + 1;
        HashSet<String> centresInteret = new HashSet<>();
        centresInteret.add("Football");
        service.ajouterJoueur("Jane Doe", "jd456", anneeCourante, Langues.Espanol, centresInteret);
    }
}
