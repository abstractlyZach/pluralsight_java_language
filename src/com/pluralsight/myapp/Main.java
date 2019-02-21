package com.pluralsight.myapp;

import com.pluralsight.calcengine.Adder;
import com.pluralsight.calcengine.CalculateHelper;
import com.pluralsight.calcengine.DynamicHelper;
import com.pluralsight.calcengine.InvalidStatementException;
import com.pluralsight.calcengine.MathProcessing;
import com.pluralsight.calcengine.PowerOf;

public class Main {

    public static void main(String[] args) {
//        MathEquation[] equations = new MathEquation[4];
//        equations[0] = new MathEquation(100d, 50d, 'd');
//        equations[1] = new MathEquation(25d, 92d, 'a');
//        equations[2] = new MathEquation(225d, 17d, 's');
//        equations[3] = new MathEquation(11d, 3d, 'm');
//
//        for (MathEquation equation : equations) {
//            equation.execute();
//            System.out.print("result = ");
//            System.out.println(equation.getResult());
//        }
//        CalculateBase[] calculators = {
//                new Divider(100d, 50d),
//                new Adder(25d, 92d),
//                new Subtractor(225d, 17d),
//                new Multiplier(11d, 3d)
//        };
//
//        for (CalculateBase calculator : calculators) {
//            calculator.calculate();
//            System.out.print("Result: ");
//            System.out.println(calculator.getResult());
//        }

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

//        CalculateHelper helper = new CalculateHelper();
//
//        for (String statement : statements) {
//            try {
//                helper.process(statement);
//                System.out.println(helper);
//            }
//            catch (InvalidStatementException e) {
//                System.out.println(e.getMessage());
//                if (e.getCause() != null)
//                    System.out.println("   Original exception: " + e.getCause().getMessage());
//            }
//        }

    }

}
