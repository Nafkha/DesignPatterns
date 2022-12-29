package Factory.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product p;
        p = creator.factoryMethod();
        p.type();
    }
}
