/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.calculator;

/**
 *
 * @author Laura Lüthi
 */
public class Calculator {

    private double result;

    public void addition(double summand1, double summand2) {
        this.result = summand1 + summand2;

    }

    public double getResult() {
        return result;
    }
}
