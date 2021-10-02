package com.company;

import java.util.Scanner;

public class Main {
    static int balance = 1000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int language = showMenu(input);
        if (language == 1) {
            System.out.println("Sveiki");
            System.out.println("Izvēlaties operāciju");
        }
        if (language == 2) {
            System.out.println("Здравствуйте!");
            System.out.println("Выберите операцию");
        }
        if (language == 3) {
            System.out.println("Hello");
            System.out.println("Please choose an operation");
        }
        int operation = chooseOperation(input);
        if (operation == 1) {
            System.out.println("Your balance is " + balance);
        } else if (operation == 2) {
            takeOutMoney(input);
        } else
            deposit(input);
    }


    static int showMenu(Scanner input) {
        System.out.println("Izvelaties valodu  Выберите язык  Select Language  ");
        System.out.println("1 - Latvian");
        System.out.println("2 - Русский");
        System.out.println("3 - English");
        return input.nextInt();
    }

    static int chooseOperation(Scanner input) {
        System.out.println("1 - Check the Balance");
        System.out.println("2 - Withdraw money");
        System.out.println("3 - Place Deposit");
        return input.nextInt();
    }

    static void takeOutMoney(Scanner input) {
        System.out.println("Enter the amount");
        int sum = input.nextInt();
        System.out.println(sum <= balance ? ("Here you go " + sum) : "insufficient balance");
    }

    static void deposit(Scanner input) {
        System.out.println("Please place the money");
        int deposit = input.nextInt();
        System.out.println(deposit > 0 ? "Your money were transferred to your account" : "Incorrect amount");
        System.out.println("Thank you!");
    }
}





