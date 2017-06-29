public class BigMacBuilder extends MealBuilder{
    public Food buildFood(){
      return new BigMac();
    }
    public Drink builDrink(){
      return new Coke();
    }
    public Sides buildSides(){
      return new Fries();
    }
    /*
    public Meal build(){
      Meal m = new Meal();
      m.setFood(buildFood())
          .setDrink(builDrink())
          .setSides(buildSides());
      return m;
    }*/
}
