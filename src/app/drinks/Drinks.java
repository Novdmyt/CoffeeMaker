package app.drinks;

public class Drinks {
    private Drink drink;

    public void setDrink(Drink drink){
        this.drink = drink;
    }
    public void startDrink(){
        System.out.printf("Your %s. Enjoy :)", drink.prepare());
    }

}
