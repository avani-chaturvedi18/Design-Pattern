package AbstractFactoryDesign;

public class RoundedShapeFactory extends FactoryClass {
    @Override
    public shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new roundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new roundedSquare();
        }
        return null;
    }
}
