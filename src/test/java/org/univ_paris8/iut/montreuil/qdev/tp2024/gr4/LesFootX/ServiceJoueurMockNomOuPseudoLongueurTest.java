package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.impl.ServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IServicesJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.Enum.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.*;


public class ServiceJoueurMockNomOuPseudoLongueurTest {

    private IServicesJoueur service;
    @Before
    public void setUp() {
        service = ServicesJoueur.getInstance();
        //service = new ServiceJoueurMockNomOuPseudoLongueur();
    }

    @Test(expected = NomOuPseudoLongueurException.class)
    public void ajouterJoueurAvecNomOuPseudoTropCourt() throws NomOuPseudoLongueurException, CentresInteretVidesException, JoueurDejaExistantException, AnneeNaissanceInvalideException, FormatLangueInvalideException {
        service.ajouterJoueur("Jo", "ps", 1990, Langues.Anglais, new HashSet<>());
    }
}
