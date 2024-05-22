package MethodReference;

import java.util.function.IntBinaryOperator;

public class MethodReferences {
    public static void main(String[] args) throws Exception {
        IntBinaryOperator operator;

        operator = Calculator::staticMethod;
        System.out.println("정적메서드 결과 : " + operator.applyAsInt(3,5));

        Calculator calculator = new Calculator();
        operator = calculator::instanceMethod;
        System.out.println("인스턴스 메서드 결과 : "+operator.applyAsInt(3,5));

    }
}
