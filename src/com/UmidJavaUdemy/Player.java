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
