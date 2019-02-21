package com.pluralsight.myapp;

import com.pluralsight.calcengine.Adder;
import com.pluralsight.calcengine.DynamicHelper;
import com.pluralsight.calcengine.MathProcessing;
import com.pluralsight.calcengine.PowerOf;

public class Main {

    public static void main(String[] args) {

        String[] statements = {
//                "add 1.0",       // Error: incorrect number of values
//                "add xx 26.0",   // Error: non-numeric data
//                "addX 0.0 0.0",  // Error: invalid command
//                "divide 100 50",
                "add 25 92",
                "power 5.0 2.0",
//                "subtract 225 17",
//                "multiply 11 3"
        };

        MathProcessing[] operations = new MathProcessing[] {
                new Adder(),
                new PowerOf(),
        };

        DynamicHelper helper = new DynamicHelper(operations);

        for (String statement : statements) {
            String output = helper.process(statement);
            System.out.println(output);
        }

    }

}
