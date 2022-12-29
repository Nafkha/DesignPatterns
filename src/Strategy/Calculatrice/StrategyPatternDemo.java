package Strategy.Calculatrice;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Strategy s = new OperationAdd();
        Context c  = new Context(s);
        System.out.println(c.executeStrategy());
        s = new OperationMultiply();
        c = new Context(s);
        System.out.println(c.executeStrategy());
        s = new OperationSubstract();
        c = new Context(s);
        System.out.println(c.executeStrategy());
    }
}
