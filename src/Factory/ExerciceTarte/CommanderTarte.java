package Factory.ExerciceTarte;

public class CommanderTarte implements CommanderTarteInterface{
    @Override
    public Tarte commanderTarte(String typeTarte) {
        if(typeTarte.toUpperCase().equals("POMMES")){
            return new TartePomme();
        }else if(typeTarte.toUpperCase().equals("PRUNES")){
            return new TartePrunes();
        }else if(typeTarte.toUpperCase().equals("POIRES")){
            return new TartePoire();
        }

        return null;
    }
}
