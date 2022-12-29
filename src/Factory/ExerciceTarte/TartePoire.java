package Factory.ExerciceTarte;

public class TartePoire extends Tarte{
    @Override
    void preparer() {
        System.out.println("Preparer Tarte Poire");
    }

    @Override
    void cuire() {

        System.out.println("Cuire Tarte Poire");

    }
}
