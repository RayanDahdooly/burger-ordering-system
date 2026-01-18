public class Burger extends Item {

    private Item extra1 ;
    private Item extra2 ;
    private Item extra3 ;

    public Burger(String name,  double price) {
        super(name, "Burger", price);
    }

    @Override
    public String getName() {
        return super.getName() + " Burger" ;
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice()
                + ((extra1 == null) ? 0 : extra1.getAdjustedPrice())
                + ((extra2 == null) ? 0 : extra2.getAdjustedPrice())
                + ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraprice( String toppingName){

        return switch ( toppingName ){
            case "Avocado" , "cheese" -> 1.0 ;
            case "Salami" -> 1.5 ;
            default -> 0.0;
        };
    }

    public void addTopping( String extra1 , String extra2 , String extra3 ){

        this.extra1 = new Item( extra1 ,  "topping", getExtraprice(extra1) ) ;
        this.extra2 = new Item( extra2 ,  "topping", getExtraprice(extra2) ) ;
        this.extra3 = new Item( extra3 ,  "topping", getExtraprice(extra3) ) ;

    }

    public void printItemizedList(){

        printItem( getName(), getBasePrice() ) ;
        if ( extra1 != null ) {
            extra1.printItem( ) ;
        }
        if ( extra2 != null ) {
            extra2.printItem( ) ;
        }
        if ( extra3 != null ) {
            extra3.printItem() ;
        }

    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println( "-" .repeat( 30 ) );
        super.printItem();
    }
}
