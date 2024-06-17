/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmetic;

/**
 *
 * @author jenil
 */
public class OperationFactory {
    public ArithmeticOperation createOperation(OperationType type) {
        switch (type) {
            case PLUS:
                return new AdditionOperation();
            case MINUS:
                return new SubtractionOperation();
            case TIMES:
                return new MultiplicationOperation();
            case DIVIDE:
                return new DivisionOperation();
            default:
                throw new IllegalArgumentException("Unknown operation: " + type);
        }
    }
}