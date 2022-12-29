package Strategy.Example;

public class Context {
    private Strategy maStrategie;

    public Context(Strategy maStrategie) {
        this.maStrategie = maStrategie;
    }
    public  void executeStrategy(){
        maStrategie.execute();
    }
}
