public class MealOrder {

    private Burger burger ;
    private Item drink ;
    private Item side ;

    public MealOrder( ){

        this( "regular" , "coke" , "fries") ;
    }

    public MealOrder( String burgerType , String drinkType , String side ) {

        if( burgerType.equalsIgnoreCase("deluxe") ){

            this.burger = new DeluxeBurger("Deluxe Burger" , 8.5 ) ;
        }

        else {

            this.burger = new Burger(burgerType, 4.0);
        }

        this.drink = new Item( "drink" , drinkType , 1.0 ) ;
        this.side = new Item( "side" , side , 1.5 ) ;

    }

    public double getTotalPrice(){

        if  ( burger instanceof DeluxeBurger ){

            return burger.getAdjustedPrice() ;
        }
        return side.getAdjustedPrice()
                +burger.getAdjustedPrice()
                +drink.getAdjustedPrice();
    }

    public void printItemizedList(){

        burger.printItem() ;
        if ( burger instanceof DeluxeBurger ) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        }
        else {
            side.printItem();
            drink.printItem();
        }
        System.out.println("-".repeat(30)) ;
        Item.printItem("total price" , getTotalPrice()) ;
    }

    public void addBurgerToppings( String extra1 , String extra2 , String extra3 ){

        burger.addTopping( extra1 , extra2 , extra3 ) ;
    }

    public void addBurgerToppings( String extra1 , String extra2 , String extra3 , String extra4 ,  String extra5 ){

        if ( burger instanceof DeluxeBurger db) {
            db.addTopping( extra1 , extra2 , extra3 , extra4 , extra5 ) ;
        }else {
            burger.addTopping( extra1 , extra2 , extra3 ) ;

        }

    }

    public void setDrink( String size ){
       drink.setSize( size ) ;
    }
}

