package Observer.ObserverExample1;

public class Test {

    public static void main(String[] args) {
        Toto toto = new Toto("Observateur toto 1");

        Timer t = new Timer();

        t.addObserver(toto);

        System.out.println("La valeur initiale est "+t.getX());
        for(int i =0 ; i< 15; i++){
            t.setX(i);
        }
    }

}
