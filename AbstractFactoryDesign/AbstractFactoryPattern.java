package AbstractFactoryDesign;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        FactoryClass shapeFactory = FactoryProducer.getFactory(false);
        shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        FactoryClass shapeFactory1 = FactoryProducer.getFactory(true);
        shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}

