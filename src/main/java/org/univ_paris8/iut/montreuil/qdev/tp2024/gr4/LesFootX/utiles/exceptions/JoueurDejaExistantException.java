package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exceptions;

public class JoueurDejaExistantException extends Exception {
    public String JoueurDejaExistantException(String s) {
         return "Un joueur avec ce pseudo existe déjà";
    }
}
