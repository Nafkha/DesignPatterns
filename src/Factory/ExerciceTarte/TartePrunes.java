package Factory.ExerciceTarte;

public class TartePrunes extends Tarte{
    @Override
    void preparer() {
        System.out.println("Preparer Tarte Prunes");
    }
    @Override
    void cuire() {

        System.out.println("Cuire Tarte Prunes");

    }
}
