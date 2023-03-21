package FactoryDesign;

public class mainFactory {
    public static void main(String[] args) {

        Factory n=new Factory();
        OS o= (OS) n.createPhone("weakest");
        o.display();
    }
}