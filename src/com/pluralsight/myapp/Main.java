package com.pluralsight.myapp;

import com.pluralsight.calcengine.Adder;
import com.pluralsight.calcengine.Divider;
import com.pluralsight.calcengine.DynamicHelper;
import com.pluralsight.calcengine.InvalidStatementException;
import com.pluralsight.calcengine.MathProcessing;
import com.pluralsight.calcengine.Multiplier;
import com.pluralsight.calcengine.PowerOf;
import com.pluralsight.calcengine.Subtractor;

public class Main {

    public static void main(String[] args) {

        String[] statements = {
                "add 1.0",       // Error: incorrect number of values
                "add xx 26.0",   // Error: non-numeric data
//                "addX 0.0 0.0",  // Error: invalid command
                "divide 100 50",
                "add 25 92",
                "power 5.0 2.0",
                "subtract 225 17",
                "multiply 11 3"
        };

        MathProcessing[] operations = new MathProcessing[] {
                new Adder(),
                new PowerOf(),
                new Divider(),
                new Multiplier(),
                new Subtractor(),
        };

        DynamicHelper helper = new DynamicHelper(operations);

        String output;
        for (String statement : statements) {
            try {
                output = helper.process(statement);
            }
            catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println(output);
        }

    }

}
