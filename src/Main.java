public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink" , "coke" , 1.50 ) ;
//        Item avocado =  new Item("Topping" , "avocado" , 0.75 ) ;
//          Burger cheesburger = new Burger("reguler" , 4.00) ;
//          cheesburger.addTopping("cheese" ,"non" , "non");
//          cheesburger.printItem();

//        MealOrder RmealOrder = new MealOrder( ) ;
//        RmealOrder.printItemizedList();

//          MealOrder regulerMeal = new MealOrder( "regular" , "coke" , "fries" ) ;
//          regulerMeal.addBurgerToppings("cheese" , "cheese" , "mayo");
//          regulerMeal.setDrink("large");
//          regulerMeal.printItemizedList();

          MealOrder dbMeal = new MealOrder("deluxe" , "7Up", "chili") ;
          dbMeal.addBurgerToppings("avocado" , "lettuce" , "mayo" , "cheese" , "non");
          dbMeal.printItemizedList();





    }
}
