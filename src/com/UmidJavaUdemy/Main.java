package com.UmidJavaUdemy;


public class Main {

    public static void main(String[] args) {
//	    Wall eastWall = new Wall("East");
//        Wall westWall = new Wall("West");
//        Wall southWall = new Wall("South");
//        Wall northWall = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(8, 5);
//        Bed bed =  new Bed("Classic", 4,5, 3, 2);
//        Lamp lamp = new Lamp("Desk", true, 100);
//
//        Bedroom bedroom = new Bedroom("Big", eastWall, westWall, southWall, northWall, ceiling, bed, lamp);
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();

//        Player player = new Player();
//        player.name = "Sam";
//        player.health = 100;
//        player.weapon = "Gun";
//
//        int damage = 18;
//        player.looseHealth(damage);
//        System.out.println("Health remaining "+ player.healthRemaining());
//
//        damage = 200;
//        player.looseHealth(damage);
//        System.out.println("Health remaining "+ player.healthRemaining());

//        BetterPlayer betterPlayer = new BetterPlayer("Player", "Gun", 600);
//        System.out.println("Health is "+ betterPlayer.g Printer printer = new Printer(50.0, false);
////        System.out.println("initial page coount = " + printer.getNumberOfPages());
////        int printedPages = printer.pagesPrinted(4);
////        System.out.println("Printed " + printedPages + " pages, total count for printer " + printer.getNumberOfPages());
////        printedPages = printer.pagesPrinted(2);
////        System.out.println("Printed " + printedPages + " pages, total count for printer " + printer.getNumberOfPages());
////        printer.fillUpToner(60.0);
////        System.out.println("Toner " + printer.getTonerLevel());etHealth());
//
//        for(int i = 1; i < 11; i++){
//            Movie movie = someMovie();
//            System.out.println("Movie # " + i + " " + movie.getTitle()+ " \n" + "Plot: " +
//                    movie.idea() + "\n");
//        }
//
//    }
//    //polomorphysm
//    public static Movie someMovie(){
//        int rand = (int)(Math.random()*5)+1;
//        System.out.println("Random number is " + rand);
//        switch (rand) {
//            case 1:
//                return new Horror();
//            case 2:
//                return new Comedy();
//            case 3:
//                return new Drama();
//            case 4:
//                return new SciFi();
//            case 5:
//                return new Musicle();
//        }
//        return null;

//        Car car = new Car("Car", 9);
//        System.out.println(car.accelerate() + "\n" + car.brake() +
//                "\n"+ car.startEngine());
//        Hatchback hatchback = new Hatchback("Hyundai", 6);
//        System.out.println(hatchback.accelerate() + "\n" + hatchback.brake() +
//                "\n"+ hatchback.startEngine());
//
//        SUV suv= new SUV("Toyota", 12);
//        System.out.println(suv.accelerate() + "\n" + suv.brake() +
//                "\n"+ suv.startEngine());
//
//        Track track = new Track("Ford RAM", 18);
//        System.out.println(track.accelerate() + "\n" + track.brake() +
//                "\n"+ track.startEngine());
        Hamburger hamburger = new Hamburger("Standard", "well done");
        hamburger.finalPrice(0, 1, 0, 1);
        System.out.println("\n");
        HealthyBurger healthyBurger = new HealthyBurger("rare");
        healthyBurger.finalPrice(1, 0, 0, 0, 1, 1);
        System.out.println("\n");
        DeluxBurger deluxBurger = new DeluxBurger("White", "medium");
        deluxBurger.finalPrice();

    }
}
