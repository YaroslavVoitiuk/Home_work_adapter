package ru.netology;

public class Main {
    public static void main( String[] args ){

        Ints ints = new IntsCalculator();
        System.out.println(ints.sum(10,2));
        System.out.println(ints.mult(10,3));
        System.out.println(ints.pow(10,2));

    }
}
