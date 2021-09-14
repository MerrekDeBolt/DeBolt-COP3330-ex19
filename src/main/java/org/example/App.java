package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 18 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        double height, weight, bmi;

        Scanner scanner;

        do
        {
            System.out.println("Enter your height in inches: ");
            try
            {
                scanner = new Scanner(System.in);
                height = scanner.nextDouble();
            }
            catch (Exception ex)
            {
                System.out.println("Invalid input");
                height = -1;
            }
        }
        while (height == -1);

        do
        {
            System.out.println("Enter your weight in inches: ");
            try
            {
                scanner = new Scanner(System.in);
                weight = scanner.nextDouble();
            }
            catch (Exception ex)
            {
                System.out.println("Invalid input");
                weight = -1;
            }
        }
        while (weight == -1);

        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + String.format("%.1f", bmi) + ".");

        if (bmi < 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else if (bmi >= 18.5 && bmi <= 25)
            System.out.println("You are within the ideal weight range.");
        else if (bmi > 25)
            System.out.println("You are overweight. You should see your doctor.");
    }
}