package Factory.SimpleFactory;

public class ConcreteProduct implements Product{
    @Override
    public void type() {
        System.out.println("I'm Concrete Product");
    }
}
