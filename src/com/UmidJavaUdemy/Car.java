package com.UmidJavaUdemy;

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).
class Car {
    private String name;
    private int cylinder, wheels;
    private boolean engine;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        if (wheels < 0) {
            this.wheels = 0;
        } else {
            this.wheels = 4;
        }

        this.engine = true;
    }

    public String startEngine() {
        return "Car-> engine started";
    }

    public String accelerate() {
        return "Car-> accelerating";
    }

    public String brake() {
        return "Car-> pushing brakes";
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }
}

class Hatchback extends Car {
    public Hatchback(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " started engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerated";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " pushed brakes";
    }
}

class Track extends Car {
    public Track(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " started engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerated";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " pushed brakes";
    }
}

class SUV extends Car {
    public SUV(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " started engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerated";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " pushed brakes";
    }
}


