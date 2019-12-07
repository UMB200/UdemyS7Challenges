package com.UmidJavaUdemy;
// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.
public class Printer {
    private double tonerLevel;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(double tonerLevel,  boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel < 100.0) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.numberOfPages = 0;
    }

    public double fillUpToner(double extraPowder) {
        if (this.tonerLevel > 0 && this.tonerLevel <= 100.0) {
            if (this.tonerLevel + extraPowder > 100) {
                System.out.println("No filling is necessary");
                return -1.0;
            }
            System.out.println("Printer loaded " + tonerLevel);
            tonerLevel += extraPowder;
            return tonerLevel;
        } else return -1;
    }

    public int pagesPrinted(int print) {
        int pagesToPrint = print;
        if(this.isDuplex){
            pagesToPrint = (print/2) + (print %2);
            System.out.println("Printing double sided");
        }
        this.numberOfPages += pagesToPrint;
        return pagesToPrint;
    }

    public double getTonerLevel() {
        return this.tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
