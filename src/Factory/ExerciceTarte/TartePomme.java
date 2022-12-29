package Factory.ExerciceTarte;

public class TartePomme extends Tarte{

    @Override
    void preparer() {
        System.out.println("Preparer Tarte Pomme");
    }

    @Override
    void cuire() {
        System.out.println("Cuire Tarte Pomme");
    }
}
