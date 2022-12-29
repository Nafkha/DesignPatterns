package Observer.ObserverTD.PartieA;

import java.util.Observable;

public class Ordre extends Observable {
    int numOrdre;
    String designationOrdre;

    public Ordre(int numOrdre, String designationOrdre) {
        this.numOrdre = numOrdre;
        this.designationOrdre = designationOrdre;
    }

    void donnerOrdre(String d){
        this.designationOrdre =d;
        this.numOrdre++;
        this.setChanged();
        this.notifyObservers();
    }
    public String lireOrdre(){
        return this.designationOrdre;
    }
    public int lireNumOrdre(){
        return this.numOrdre;
    }
}
