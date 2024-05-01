package org.example.stream_api.callCenter;

public class Operator {
    public void call(OperatorAction operatorAction) {
        System.out.println("Оператор начинает звонок!");
        operatorAction.actions();
        System.out.println("Оператор завершает звонок!");
    }
}
