package BuilderDesign;

public class PhoneBuilder {

    // instance fields
    private String os;
    private String processor;
    private int ram ;
    private String brand;

    // Setter Methods

    public PhoneBuilder setOs(String os)
    {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor)
    {
        this.processor = processor;
        return this;
    }

    public  PhoneBuilder setRam(int ram)
    {
        this.ram = ram;
        return this;
    }

    public  PhoneBuilder setBrand(String brand)
    {
        this.brand = brand;
        return this;
    }

    @Override public String toString()
    {
        return "os = "+this.os + " " + ", processor = "+this.processor  + " " + ", ram = "+this.ram  + " " + "brand = " + brand ;
    }


    public static void main(String args[])
    {
        PhoneBuilder p1 = new PhoneBuilder();
        PhoneBuilder p2 = new PhoneBuilder();

        p1.setOs("Windows");
        p1.setProcessor("icore5");
        p1.setRam(4);
        p1.setBrand("Lenova");

        System.out.println(p1);
        //System.out.println(p2);
    }

}
