package com.study.pattern.strategy.operation;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("2 + 3 = " + context.executeStrategy(2, 3));

        context = new Context(new OperationMultiply());
        System.out.println("2 * 3 = " + context.executeStrategy(2, 3));

        context = new Context(new OperationSubstract());
        System.out.println("2 - 3 = " + context.executeStrategy(2, 3));
    }


}
