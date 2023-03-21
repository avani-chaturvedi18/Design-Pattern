package FacadeDesignPattern;

public class Pasta implements Food{
    public String preparedItems;
    @Override
    public void prepareFood(String itemRequired) {
        preparedItems = "This is the Pasta with ingredients: "+ itemRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItems;
    }
}
