package Factory.ExerciceTarte;

public class Client{

    public static void main(String[] args) {

        CommanderTarteInterface c = new CommanderTarte();

        Tarte t1 = c.commanderTarte("pommes");
        Tarte t2 = c.commanderTarte("poires");
        Tarte t3 = c.commanderTarte("prunes");

        System.out.println("Tarte 1");
        t1.preparer();
        t2.cuire();
        t3.emballage();
        System.out.println("Tarte 2 ");
        t2.preparer();
        t2.cuire();
        t2.emballage();
        System.out.println("Tarte 3");
        t3.preparer();
        t3.cuire();
        t3.emballage();

    }
}
