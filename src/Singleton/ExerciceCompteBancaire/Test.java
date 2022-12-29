package Singleton.ExerciceCompteBancaire;

public class Test {
    public static void main(String[] args) {
        CompteBancaire cb1 = new CompteBancaire(123);
        cb1.deposerArgent(100);
        cb1.retirerArgent(80);
        CompteBancaire cb2 = new CompteBancaire(456);
        cb2.retirerArgent(10);

        System.out.println((Journalisation.getInstance().afficherLog()));
    }
}
