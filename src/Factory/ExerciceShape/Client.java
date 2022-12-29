package Factory.ExerciceShape;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Donner le shape");
        Scanner sc = new Scanner(System.in);
        String sh = sc.nextLine();
        Creator c = new CreatorClass();

        Shape s = c.factoryMethod(sh);

        s.draw();
    }
}
