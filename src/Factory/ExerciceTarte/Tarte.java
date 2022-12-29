package Factory.ExerciceTarte;

public abstract class Tarte {

    abstract void preparer();
    abstract void cuire();

    public void emballage(){
        System.out.println("Emballage");
    }

}
