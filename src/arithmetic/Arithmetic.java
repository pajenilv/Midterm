/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double n = scanner.nextDouble();
        System.out.println("Enter second number:");
        double m = scanner.nextDouble();

        OperationType operationType = getOperationType(scanner);
        OperationFactory factory = new OperationFactory();
        ArithmeticOperation operation = factory.createOperation(operationType);

        double result = operation.calculate(n, m);
        System.out.println("Result: " + result);
    }

    private static OperationType getOperationType(Scanner scanner) {
        System.out.println("Enter arithmetic operation to perform (PLUS, MINUS, TIMES, DIVIDE):");
        String input = scanner.next().toUpperCase();
        return OperationType.valueOf(input);
    }
}