/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        int numPeople = in.nextInt();
        System.out.print("How many pizzas do you have? ");
        int numPizzas = in.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = in.nextInt();

        int numSlices = numPizzas * slicesPerPizza;
        int slicesPerPerson = numSlices / numPeople;
        int leftoverSlices = numSlices % numPeople;

        System.out.printf("%d people with %d pizzas (%d slices)\n", numPeople, numPizzas, numSlices);
        System.out.printf("Each person gets %d pieces of pizza.\n", slicesPerPerson);
        System.out.printf("There are %d leftover pieces.\n", leftoverSlices);
    }
}
