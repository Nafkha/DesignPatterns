package Observer.ObserverExample1;

import java.util.Observable;

public class Timer extends Observable {
    private  int x = 0;
    Timer(){}

    public void setX(int x){
        this.x=x;
        this.setChanged();
        this.notifyObservers();
    }
    public int getX(){
        return x;
    }
}
