package AbstractFactoryDesign;

public class Rectangle implements shape {
    @Override
    public void draw() {
        System.out.println("I am rectangle inside Shape.");
    }
}
