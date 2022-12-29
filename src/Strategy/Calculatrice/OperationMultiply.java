package Strategy.Calculatrice;

import java.util.Scanner;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation() {
        System.out.println("Donner a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Donner b");
        int b = sc.nextInt();
        return a*b;
    }
}
