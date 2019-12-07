package com.UmidJavaUdemy;

class Movie{
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public String idea(){
        return "No idea";
    }
}

class Horror extends Movie{
    public Horror(){
        super("Horror");
    }
    @Override
    public String idea(){
        return  "Very scary";
    }
}

class Comedy extends Movie{
    public Comedy() {
        super("Very funny");
    }
    @Override
    public String idea() {
        return "Super funny";
    }
}

class Drama extends Movie{
    public Drama() {
        super("Uti puti");
    }

    @Override
    public String idea() {
        return "A lot of tears";
    }
}
class SciFi extends Movie{
    public SciFi() {
        super("Strange");
    }

    @Override
    public String idea() {
        return "Weird movie";
    }
}
class Musicle extends Movie{
    public Musicle() {
        super ("A lot of dance");
    }
    //no idea method
}

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
//        System.out.println("Health is "+ betterPlayer.getHealth());
        Printer printer = new Printer(50.0, false);
        System.out.println("initial page coount = " + printer.getNumberOfPages());
        int printedPages = printer.pagesPrinted(4);
        System.out.println("Printed " + printedPages + " pages, total count for printer " + printer.getNumberOfPages());
        printedPages = printer.pagesPrinted(2);
        System.out.println("Printed " + printedPages + " pages, total count for printer " + printer.getNumberOfPages());
        printer.fillUpToner(60.0);
        System.out.println("Toner " + printer.getTonerLevel());

    }
}
