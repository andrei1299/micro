package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int elem1 = 0;
        int elem2 = 1;
        int aux;
	System.out.println("Hello World!");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");

        //se citeste de la tastatura al n-lea numar din sirul fibbonaci

        int myint = keyboard.nextInt();
        // se afla care e numarul cerut
        for(int i = 1;i<myint;i++){
            aux = elem2 + elem1;
            elem1 = elem2;
            elem2 = aux;
        }
        // se afiseaza al n-lea numar din sir
        System.out.println(elem2);
    }
}
