package Strategy.Example;

public class Test {

    public static void main(String[] args) {
        Strategy s = new StrategieA();
        Context c = new Context(s);
        c.executeStrategy();
    }
}
