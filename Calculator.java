package JCaltech.Module1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Welcome to Arithmetic calculator    ");
        System.out.println("--------------------------------");
        System.out.println("How many operation do you want to do?    ");
        System.out.println("--------------------------------");


        int numberOfOperations = exceptionInt(input);
        while (numberOfOperations <= 0) {
            System.out.println("Please choose an integer greater than 0: ");
            numberOfOperations = exceptionInt(input);

        }
        System.out.println("------Enter first value------");
        double firstChosenNumber = exceptionDouble(input);

        System.out.println("------Enter second value-----");
        double secondChosenNumber = exceptionDouble(input);

        System.out.println("Please choose a type of operation from these: \n");
        System.out.println("1) \"add\" for adding two numbers");
        System.out.println("2) \"sub\" for Subtraction two numbers");
        System.out.println("3) \"mul\" for Multiplication two numbers");
        System.out.println("4) \"div\" for Division two numbers");
        System.out.println("5) \"avg\" for Average two numbers");

        String caseYouChoose = input.next();

        while (true) {
            switch (caseYouChoose) {

                case "add" -> {
                    System.out.println("First number is " + firstChosenNumber + " , second number is " +
                            secondChosenNumber + " And Addition : " +
                            Calculator.add(firstChosenNumber, secondChosenNumber));
                    numberOfOperations--;

                }
                case "sub" -> {
                    System.out.println("First number is " + firstChosenNumber + " , second number is " +
                            secondChosenNumber + " And Subtraction : " +
                            Calculator.sub(firstChosenNumber, secondChosenNumber));
                    numberOfOperations--;

                }
                case "mul" -> {
                    System.out.println("First number is " + firstChosenNumber + " , second number is " +
                            secondChosenNumber + " And Multiplication : " +
                            Calculator.mul(firstChosenNumber, secondChosenNumber));
                    numberOfOperations--;

                }
                case "div" -> {
                    System.out.println("First number is " + firstChosenNumber + " , second number is " +
                            secondChosenNumber + " And Division : " +
                            Calculator.div(firstChosenNumber, secondChosenNumber));
                    numberOfOperations--;

                }
                case "avg" -> {
                    System.out.println("First number is " + firstChosenNumber + " , second number is " +
                            secondChosenNumber + " And Average : " +
                            Calculator.avg(firstChosenNumber, secondChosenNumber));
                    numberOfOperations--;

                }
                default -> System.out.println("Please choose from: \"add\", \"sub\", \"mul\", \"div\", \"avg\" ");
            }

            if (numberOfOperations != 0 && (caseYouChoose.equals("add") || caseYouChoose.equals("sub") || caseYouChoose.equals("mul") ||
                    caseYouChoose.equals("div") || caseYouChoose.equals("avg"))) {
                System.out.println("You have " + numberOfOperations + " operations left");

                System.out.println("------Enter first value------");

                firstChosenNumber = exceptionDouble(input);

                System.out.println("------Enter second value-----");

                secondChosenNumber = exceptionDouble(input);

                System.out.println("Please choose a type of operation from these: \n");
                System.out.println("1) \"add\" for adding two numbers");
                System.out.println("2) \"sub\" for Subtraction two numbers");
                System.out.println("3) \"mul\" for Multiplication two numbers");
                System.out.println("4) \"div\" for Division two numbers");
                System.out.println("5) \"avg\" for Average two numbers");
                caseYouChoose = input.next();
            }

            else if (numberOfOperations == 0) break;
            else caseYouChoose = input.next();

        }
    }

    public static double add(double num1, double num2) {
        return (num1 + num2);
    }

    public static double sub(double num1, double num2) {
        return (num1 - num2);
    }

    public static double mul(double num1, double num2) {
        return  (num1 * num2);
    }

    public static double div(double num1, double num2) {
        return (num1 / num2);
    }

    public static double avg(double num1, double num2) {
        return (num1+num2)/2;
    }

    public static int exceptionInt(Scanner scanner){

        int number;
        while(true){
            try {
                number = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Please choose an integer");
                scanner.nextLine();
                continue;
            }
            break;
        }
        return number;
    }

    public static double exceptionDouble(Scanner scanner){
        double number;
        while(true){
            try {
                number = scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Please choose a double: ");
                scanner.nextLine();
                continue;
            }
            break;
        }
        return number;
    }
}
