package Factory.ExerciceShape;

public class CreatorClass implements  Creator{
    @Override
    public Shape factoryMethod(String shapeType) {
        if(shapeType.toUpperCase().equals("SQUARE")){
            return new Square();
        }else if(shapeType.toUpperCase().equals("CERCLE")){
            return new Cercle();
        }else if(shapeType.toUpperCase().equals("RECTANGLE")){
            return new Rectangle();
        }else{
            return null;
        }
    }
}
