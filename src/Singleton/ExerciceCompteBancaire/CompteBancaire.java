package Singleton.ExerciceCompteBancaire;

public class CompteBancaire {
    private int numero;
    private double solde;
    Journalisation jg = Journalisation.getInstance();

    public CompteBancaire(int numero){
        this.numero = numero;
        this.solde = 0.0;
    }
    public  void deposerArgent(double depot){
        if(depot>0.0)
        {
            solde+=depot;// On ajoute la somme déposée au solde.
            jg.ajouterLog("Dépôt de "+depot+"€ sur le compte "+numero+".");
        }
        else
        {
            jg.ajouterLog("/!\\ Dépôt d'une valeur négative impossible ("+numero+").");
        }

    }
    public void retirerArgent(double retrait)
    {
        if(retrait>0.0)
        {
            if(solde>=retrait)
            {
                solde-=retrait;// On retranche la somme retirée au solde.
                jg.ajouterLog("Retrait de "+retrait+"€ sur le compte "+numero+".");
            }
            else
            {
                jg.ajouterLog("/!\\ La banque n'autorise pas de découvert ("+numero+").");
            }
        }
        else
        {
            jg.ajouterLog("/!\\ Rerait d'une valeur négative impossible ("+numero+").");
        }
    }
}
