package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities;


import java.util.ArrayList;
import java.util.Objects;

public class JoueurDTO {
   String nom;
   String  pseudo;
   int     annéeNaissance;
   Enum    langues;
   ArrayList centreInteret;


   public JoueurDTO(String nom, String pseudo, int annéeNaissance, Enum langues, ArrayList centreInteret) {
      this.nom = nom;
      this.pseudo = pseudo;
      this.annéeNaissance = annéeNaissance;
      this.langues = langues;
      this.centreInteret = new ArrayList<>();
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getPseudo() {
      return pseudo;
   }

   public void setPseudo(String pseudo) {
      this.pseudo = pseudo;
   }

   public int getAnnéeNaissance() {
      return annéeNaissance;
   }

   public void setAnnéeNaissance(int annéeNaissance) {
      this.annéeNaissance = annéeNaissance;
   }

   public Enum getLangues() {
      return langues;
   }

   public void setLangues(Enum langues) {
      this.langues = langues;
   }

   public ArrayList getCentreInteret() {
      return centreInteret;
   }

   public void setCentreInteret(ArrayList centreInteret) {
      this.centreInteret = centreInteret;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      JoueurDTO joueurDTO = (JoueurDTO) o;
      return annéeNaissance == joueurDTO.annéeNaissance && Objects.equals(nom, joueurDTO.nom) && Objects.equals(pseudo, joueurDTO.pseudo) && Objects.equals(langues, joueurDTO.langues) && Objects.equals(centreInteret, joueurDTO.centreInteret);
   }

   @Override
   public int hashCode() {
      return Objects.hash(nom, pseudo, annéeNaissance, langues, centreInteret);
   }
}
