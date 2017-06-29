public class Meal {
  public Food food;
  public Drink drink;
  public Sides sides;
  public Meal setFood(Food f){
    this.food = f;
    return this;
  }
  public Meal setDrink(Drink d){
    this.drink = d;
    return this;
  }
  public Meal setSides(Sides s){
    this.sides = s;
    return this;
  }
  public void showMeal(){
    System.out.println("Food: " + food.toString());
    System.out.println("Sides: " + drink.toString());
    System.out.println("Drink: " + sides.toString());
  }
}
