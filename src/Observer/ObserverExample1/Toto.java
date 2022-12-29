package Observer.ObserverExample1;

import java.util.Observable;
import java.util.Observer;

public class Toto implements Observer {

    public String nom;

    public Toto(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Je suis "+this.nom+" la nouvelle valeur X de la classe timer est : "+((Timer)o).getX());
    }
}
