package Factory.SimpleFactory;

public class ConcreteCreator implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
