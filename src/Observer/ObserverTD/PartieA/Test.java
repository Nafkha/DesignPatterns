package Observer.ObserverTD.PartieA;

public class Test {
    public static void main(String[] args) {
        Employe e = new Employe("Youssef");
        Employe e1 = new Employe("Hamma");

        Ordre o = null;
        o = new Ordre(1,"Créer quelque chose");
        o.addObserver(e);

        o.donnerOrdre("Créer quelque chose");
    }
}
