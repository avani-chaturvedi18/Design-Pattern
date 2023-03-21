package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

abstract class Component{
    protected String name;
    public Component(String n){
        name = n;
    }
    public abstract void showName();
    public abstract int getPrice();
}

class Leaf extends Component{
    private int price;
    public Leaf(String name)
    {
        super(name);
    }
    public Leaf(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public void showName()
    {
        System.out.println("Leaf : " + name);
    }

    @Override
    public int getPrice() {
        return price;
    }

}

class Composite extends Component{
    int total;
    private List<Component> ls = new ArrayList<Component>();

    public Composite(String name)
    {
        super(name);
    }

    @Override
    public void showName() {
        System.out.println("Composite : " + name);

        for(Component c : ls){
            c.showName();
        }
    }

    @Override
    public int getPrice() {
        for(Component c : ls){
            total += c.getPrice();
        }
        return total;
    }


    public void addComponent(Component c)
    {
        ls.add(c);
    }

    public void removeComponent(Component c)
    {
        ls.remove(c);
    }

    public List getComponents(){
        return ls;
    }
}

public class CompositeDemo
{
    public static void main(String[] args) {
        Component l1 = new Leaf("HDD",2000);
        Component l2 = new Leaf("RAM",5000);
        Component l3 = new Leaf("CPU",20000);
        Component l4 = new Leaf("Keyboard",1500);
        Component l5 = new Leaf("Mouse",750);

        Composite c1 = new Composite("Computer");
        Composite c2 = new Composite("Cabinet");
        Composite c3 = new Composite("Peripheral");
        Composite c4 = new Composite("Mother-board");

        c4.addComponent(l2);
        c4.addComponent(l3);

        c3.addComponent(l4);
        c3.addComponent(l5);

        c2.addComponent(l1);
        c2.addComponent(c4);

        c1.addComponent(c3);
        c1.addComponent(c2);

        l1.showName();

//        c1.showName();
        System.out.println(c1.getPrice());
        System.out.println(c2.getPrice());
        System.out.println(c3.getPrice());
        System.out.println(c4.getPrice());
        c4.showName();
    }
}