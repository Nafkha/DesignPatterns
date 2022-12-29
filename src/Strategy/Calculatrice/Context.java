package Strategy.Calculatrice;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    int executeStrategy(){
        return strategy.doOperation();
    }
}
