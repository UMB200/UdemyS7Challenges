package com.UmidJavaUdemy;

// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.
class Hamburger {
    private String lettuceName = "Lettuce";
    private String tomatoName = "Tomato";
    private String carrotName = "Carrot";
    private String cucumberName = "Cucumber";
    private String bread, meat;
    private double price;
    private double extraFees = 1.0;

    public Hamburger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
        this.price = 10.0;
    }
    public void finalPrice(int lettuce, int tomato, int cucumber, int carrot){
        addExtra(lettuce, lettuceName);
        addExtra(carrot, carrotName);
        addExtra(cucumber, carrotName);
        addExtra(tomato, tomatoName);
        int itemsAdded =  lettuce + tomato + cucumber + carrot;
        calcPrice(itemsAdded);
    }
    public void calcPrice(int n){
        double finalPrice = price + (n*extraFees);
        System.out.println("Bread " + getBread() + " meat type " + getMeat());
        System.out.println("Base price is " + price);
        System.out.println("Total is " + finalPrice);
    }


    public double addExtra(int n, String nameOfAddOn) {
        if(n <=0){
            return 0;
        }
        else {
            System.out.println("Added extra fees for "  + nameOfAddOn + " " + n*extraFees);
            return n*extraFees;
        }
    }

    private String getBread() {
        return bread;
    }

    private String getMeat() {
        return meat;
    }

}

class HealthyBurger extends Hamburger{
    private String avocadoName = "Avocado";
    private String oliveName = "Olives";

    public HealthyBurger(String meat) {
        super("Rye bread", meat);
    }

    public void finalPrice(int lettuce, int tomato, int cucumber, int carrot, int avocado, int olive) {
        //super.finalPrice(lettuce, tomato, cucumber, carrot);
        super.addExtra(avocado, avocadoName);
        super.addExtra(olive, oliveName);
        int allAddedItems = lettuce + tomato + cucumber + carrot + avocado + olive;
        super.calcPrice(allAddedItems);
    }
}
class DeluxBurger extends Hamburger{
    private int chips, drink;
    private String chipName = "Chips";
    private String drinkName = "Drink";

    public DeluxBurger(String bread, String meat) {
        super(bread, meat);
        this.chips = 1;
        this.drink = 1;
    }
    public void finalPrice(){
        //super.finalPrice(0, 0, 0,0);
        super.addExtra(chips, chipName);
        super.addExtra(drink, drinkName);
        int allAddedItems = chips + drink;
        super.calcPrice(allAddedItems);
    }
}

/*Solution*/
class HamburgerUdemy{
    private String name, meat, breadRollType;
    private double price;

    private String addName1, addName2, addName3, addName4;
    private double addCost1, addCost2, addCost3, addCost4;

    public HamburgerUdemy(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }
}