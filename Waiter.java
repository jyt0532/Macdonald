public class Waiter {
  private MealBuilder builder;
  public Waiter(MealBuilder builder){
    this.builder = builder;
  }
  public Meal build(){
    Meal m = new Meal();
    m.setFood(builder.buildFood())
        .setDrink(builder.builDrink())
        .setSides(builder.buildSides());
    return m;
  }
}
