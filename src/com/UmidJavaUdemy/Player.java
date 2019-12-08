package com.UmidJavaUdemy;

public class Player {
    public String name,  weapon;
    public int health;

    public void looseHealth(int damage){
        this.health = this.health - damage;
        if(this.health < 0){
            System.out.println("Player has no health");
        }
    }
    public int healthRemaining(){
        return this.health;
    }
}
class BetterPlayer {
    public String name,  weapon;
    public int hitPoints = 100;

    public BetterPlayer(String name, String weapon, int health) {
        this.name = name;
        if(health > 0 && health <=100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints < 0){
            System.out.println("Player has no health");
        }
    }
    public int getHealth(){
        return this.hitPoints;
    }
}

