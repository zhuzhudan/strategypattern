package com.study.pattern.strategy.operation;

public class OperationSubstract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
