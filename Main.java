package com.company;

//Super Class
class Hero{
    String nama;
    public void display(){
        System.out.println("Nama hero ini adalah  :  "+ this.nama );
    }
}
// Sub Class
class HeroDuelist extends Hero{
}
// Sub Class
class HeroSentinel extends Hero{
}
public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.nama = "sova";
        hero1.display();

        HeroDuelist hero2 = new HeroDuelist();
        hero2.nama = "Jett";
        hero2.display();

        HeroSentinel hero3 = new HeroSentinel();
        hero3.nama = "Kill Joy";
        hero3.display();

    }
}
