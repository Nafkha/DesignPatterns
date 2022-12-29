package Observer.ObserverTD.PartieB;

public class Test {
    public static void main(String[] args) {
        Ordre o = new Ordre(0,"rien");
        Employe e = new Employe("Ali");
        Employe e1 = new Employe("Amir");
        o.addEmployee(e);
        o.addEmployee(e1);

        o.donnerOrdre("Saisir la liste des clients");
    }
}
