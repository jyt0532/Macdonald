public class Macdonald {
  public static void main(String[] args){
    /*
    BigMacBuilder bigMacBuilder = new BigMacBuilder();
    Waiter waiter = new Waiter(bigMacBuilder);
    Meal returnedMeal = waiter.build();
    returnedMeal.showMeal();*/
    McNuggetBuilder mcNuggetBuilder = new McNuggetBuilder();
    Waiter waiter = new Waiter(mcNuggetBuilder);
    Meal returnedMeal = waiter.build();
    returnedMeal.showMeal();
    /*
    BigMacBuilder bigMacBuilder = new BigMacBuilder();
    Meal returnedMeal = bigMacBuilder.build();
    returnedMeal.showMeal();
    */
  }
}
