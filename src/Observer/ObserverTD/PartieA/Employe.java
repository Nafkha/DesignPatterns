package Observer.ObserverTD.PartieA;

import java.util.Observable;
import java.util.Observer;

public class Employe implements Observer {

    String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.nom + " a executé l'ordre num : "+((Ordre)o).lireNumOrdre()+" de désignation : "+((Ordre)o).lireOrdre());

    }
}
