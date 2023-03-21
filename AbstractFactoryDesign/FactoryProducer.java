package AbstractFactoryDesign;

public class FactoryProducer {
    public static FactoryClass getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
