package com.UmidJavaUdemy;

class Movie{
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public String idea(){
        return "No idea";
    }

    public String getTitle() {
        return title;
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

