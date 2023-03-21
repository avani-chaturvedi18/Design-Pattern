package FacadeDesignPattern;

public class Pizza implements Food{
    public String preparedItems;

    @Override
    public void prepareFood(String itemRequired) {
        preparedItems = "This is the Pizza with ingredients: "+ itemRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItems;
    }
}
