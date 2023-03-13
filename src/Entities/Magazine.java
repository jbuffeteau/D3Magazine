package Entities;

import java.util.ArrayList;

public class Magazine
{
    private int numMagazine;
    private String nomMagazine;
    private ArrayList<Article> lesArticles;

    public Magazine(int numMagazine, String nomMagazine) {
        this.numMagazine = numMagazine;
        this.nomMagazine = nomMagazine;
        this.lesArticles = new ArrayList<>();
    }

    public int getNumMagazine() {
        return numMagazine;
    }

    public String getNomMagazine() {
        return nomMagazine;
    }

    public ArrayList<Article> getLesArticles() {
        return lesArticles;
    }
    public void AjouterArticle(Article unArticle)
    {
        lesArticles.add(unArticle);
    }


    // Cette méthode permet de calculer le montant total du magazine.
    // Ce dernier s'obtient en cumulant le montant de chaque article
    public double CalculerMontantMagazine()
    {
        double montant = 0;

        for(Article art : lesArticles)
        {
            //montant = montant + art.getNbPages() * art.getLePigiste().getPrixPage();
            montant = montant + art.CalculerMontantArticle();
        }

        return (double) Math.round(montant * 100)/100;
    }
}
