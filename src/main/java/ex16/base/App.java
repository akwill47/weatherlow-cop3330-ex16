package ex16.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 William Weatherlow
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        int age = myApp.readInput();
        String output = myApp.ageCheck(age);
        myApp.displayOutput(output);

    }
    private int readInput(){
        System.out.print("What is your age? ");
        String input = in.nextLine();
        int trueOutput = Integer.parseInt(input);
        return trueOutput;
    }
    private String ageCheck(int age){
        String output = (age >= 16)?"You are old enough to legally drive.": "You are not old enough to legally drive.";
       return output;

    }
    private void displayOutput(String output){
        System.out.println(output);
    }
}
