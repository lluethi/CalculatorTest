/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.calculator;

import java.util.Scanner;

/**
 *
 * @author Laura Lüthi
 */
public class CalculatorApp {

    public static void main(String[] args) {
        System.out.println("Dieses Programm addiert zwei Zahlen.");
        System.out.println("Beende das Programm mit 'quit'.");
        boolean quit = false;
        while (!quit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte geben Sie eine Zahl ein:");
            String input = scanner.nextLine();
            if (!input.equals("quit")) {
                double zahl1 = Double.parseDouble(input);
                System.out.println("Bitte geben Sie die zweite Zahl ein:");
                input = scanner.nextLine();
                if (input.equals("quit")) {
                    quit = true;
                    break;
                } else {
                    double zahl2 = Double.parseDouble(input);
                    Calculator cal = new Calculator();
                    cal.addition(zahl1, zahl2);
                    System.out.println("Das Resutlat ist: " + cal.getResult());
                }
            } else {
                quit = true;
            }
        }
    }
}
