package com.epum.primisen.chef2.view;

import com.epum.primisen.chef2.service.salad.Salad;

public class Printer {

    private Printer(){}

    public static void printSalad(Salad salad){
        System.out.println(salad);
    }
}
