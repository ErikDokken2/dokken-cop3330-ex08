package exercises.ex08;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex08 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex08 example08 = new ex08();

        String numPeople = example08.inputPeople();
        String numPizza = example08.inputPizza();
        String numSlices = example08.inputSlices();

        int pop = example08.strInt1(numPeople);
        int piz = example08.strInt2(numPizza);
        int slic = example08.strInt3(numSlices);

        int totalSlic = example08.totalSlic(piz, slic);
        int totalShared =  example08.totalShared(totalSlic, pop);
        int leftoverNum = example08.leftoverNum(totalShared, totalSlic, pop);

        //Output
        String outputString = example08.outputString(totalSlic, totalShared, leftoverNum, pop,piz);
        example08.printOutput(outputString);

    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private String outputString(int totalSlic, int totalShared, int leftoverNum, int pop, int piz) {
        return pop + " people with "+ piz + " pizzas (" + totalSlic + " slices)\n" +
                "Each person gets " + totalShared +" pieces of pizza.\n" +
                "There are " + leftoverNum + " leftover pieces.";
    }

    private int leftoverNum(int totalShared, int totalSlic, int pop) {
        if((totalShared * pop) < totalSlic)
        {
            return  totalSlic - (totalShared * pop) ;
        }
        return 0;
    }

    private int totalShared(int totalSlic, int pop) {
        return totalSlic / pop;
    }

    private int totalSlic( int piz, int slic) {
        return piz * slic;
    }


    private int strInt3(String numSlices) {
        int numSli = Integer.parseInt(numSlices);
        return numSli;
    }

    private int strInt2(String numPizza) {
        int numPiz = Integer.parseInt(numPizza);
        return numPiz;
    }

    private int strInt1(String numPeople) {
        int numPep = Integer.parseInt(numPeople);
        return numPep;
    }

    private String inputSlices() {
        System.out.print("How many slices per pizza? ");
        String slicesNum = in.nextLine();
        return slicesNum;
    }

    private String inputPeople() {
        System.out.print("How many people? ");
        String peopleNum = in.nextLine();
        return peopleNum;
    }


    private String inputPizza() {
        System.out.print("How many pizzas do you have? ");
        String pizzasNum = in.nextLine();
        return pizzasNum;
    }




}
