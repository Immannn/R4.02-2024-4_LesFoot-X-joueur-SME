package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.Enum.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions.JoueurDejaExistantException;
import java.util.HashSet;

class ServiceJoueurMockPseudoIdentiqueTest {

        private ServiceJoueurMockPseudoIdentique service;

        @BeforeEach
        void setUp() {
            service = new ServiceJoueurMockPseudoIdentique();
        }

        @Test
        void ajouterDeuxFoisLeMemePseudo() {
            assertDoesNotThrow(() -> service.ajouterJoueur("Premier Joueur", "pseudoTest", 2015, Langues.Anglais, new HashSet<>()));
            assertThrows(JoueurDejaExistantException.class, () -> service.ajouterJoueur("Second Joueur", "pseudoTest", 1991, Langues.Espanol, new HashSet<>()));
        }

        @Test
        void ajouterJoueurAvecPseudoUnique() {
            assertDoesNotThrow(() -> service.ajouterJoueur("Souhail Irhbira", "uniquePseudo", 2003, Langues.Anglais, new HashSet<>()));
        }
    }

