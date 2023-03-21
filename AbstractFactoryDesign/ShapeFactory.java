package AbstractFactoryDesign;

public class ShapeFactory extends FactoryClass {
    @Override
    public shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new roundedSquare();
        }
        return null;
    }
}
