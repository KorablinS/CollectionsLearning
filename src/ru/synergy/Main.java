package ru.synergy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филип Маркович");
        cats[3] = new Cat("Котяра");

       // cats[1] = null;
        System.out.println(Arrays.toString(cats));

    }

}