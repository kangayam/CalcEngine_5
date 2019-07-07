package com.get.calcengine;

// This program is to explain the inheritance - OOPS concepts, using of abstract class

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        int leftval = 30;
        int righval = 10;
        int results = 0;
        char opCode = 's';

        //MathEquation equation = new MathEquation(leftval,righval,opCode);
        //System.out.println(equation.getResults());

        // using inheritance
        System.out.println();
        System.out.println("Using inheritance");
        System.out.println();

        //CalculateBase [] calculator = new CalculateBase[4];
        CalculateBase[] calculators = {
                new Adder(leftval,righval),
                new Divider(leftval, righval),
                new Substractor(leftval, righval),
                new Multiplier(leftval, righval)
        };

        for (CalculateBase calculator: calculators ){
            calculator.calculate();
            System.out.println(calculator.getResults());

        }

            }
        }












