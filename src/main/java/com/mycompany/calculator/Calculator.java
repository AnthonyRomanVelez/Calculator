package com.mycompany.calculator;
import java.util.Scanner;

//Simple Calculator that takes two number and one operand and gives the result
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner object that takes user input
        //Variables to be use in the calculator
        double num1;
        double num2;
        String operand;
        //Print out to the screen the commands for the user to follow
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter operand: ");
        operand = scanner.nextLine();
        //Switch statements that will test the cases based on the operand the user uses.
        switch(operand){
            case "+":
                System.out.println("The result is = " + (num1 + num2));
                break;
            case "-":
                System.out.println("The result is = " + (num1 - num2));
                break;
            case "*":
                System.out.println("The result is = " + (num1 * num2));
                break;
            case "/":
                System.out.println("The result is = " + (num1 / num2));
                break; 
            default:
                System.out.println("Wrong operand... TRY AGAIN!");
        }
     
    }
}
