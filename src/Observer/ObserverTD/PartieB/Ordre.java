package Observer.ObserverTD.PartieB;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Ordre extends Observable {
    int numOrdre;
    String designationOrdre;
    ArrayList<Employe> Employees;

    public Ordre(int numOrdre, String designationOrdre) {
        this.numOrdre = numOrdre;
        this.designationOrdre = designationOrdre;
        Employees = new ArrayList<Employe>();
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
    public void addEmployee(Observer e){
        this.addObserver(e);
    }
}
