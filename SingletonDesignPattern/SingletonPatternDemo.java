package SingletonDesignPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        ABC o1 = ABC.getInstance();
        ABC o2 = ABC.getInstance();
    }

    static class ABC{
        public static ABC obj;
        private ABC(){
            System.out.println("instance created");
        }
        public static ABC getInstance(){
            if(obj == null){
                obj = new ABC();
            }
            System.out.println("I'm a single object!");
            return obj;
        }
    }
}
