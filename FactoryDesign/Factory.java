package FactoryDesign;

public class Factory<OS> {
    public OS createPhone(String c)
    {
        if (c == null || c.isEmpty())
            return null;
        switch (c) {
            case "weakest":
                return (OS) new Nokia();
            case " Interpreter":
                return (OS) new oppo();
            case " Champion":
                return (OS) new Iphone();
            default:
                throw new IllegalArgumentException("What is this behaviour "+c);
        }
    }
}
