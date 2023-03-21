package SingletonDesignPattern;

class SingletonBanker {
    private static SingletonBanker sb;
    private String value;
    private SingletonBanker(String value) {
        this.value = value;
    }
    public static SingletonBanker getSingletonBanker(String value) {
        if(sb == null) {
            sb = new SingletonBanker(value);
        }
        return sb;
    }
    public void printValue() {
        System.out.println(value);
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        SingletonBanker s1 = SingletonBanker.getSingletonBanker("Only-one");
        SingletonBanker s2 = SingletonBanker.getSingletonBanker("Second one");
        SingletonBanker s3 = SingletonBanker.getSingletonBanker("Third one");
        s1.printValue();
        s2.printValue();
        s3.printValue();
    }
}
