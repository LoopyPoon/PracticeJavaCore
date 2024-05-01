package org.example.stream_api.callCenter;

public class HighOrderFunctionExample {
    public static void main(String[] args) {
        Operator operator = new Operator();
        OperatorAction credit = () -> System.out.println("Оператор спрашивает: Хотите ли вы приобрести кредитную карту?");
        OperatorAction phone = () -> System.out.println("Оператор спрашивает: Хотите ли вы поменять тарифный план?");
        OperatorAction social = () -> {
            System.out.println("Оператор спрашивает: Вопрос №1 Сколько вам лет?");
            System.out.println("Оператор спрашивает: Вопрос №2 Нравится ли вам обслуживание в нашем магазине?");
        };

        operator.call(credit);
        operator.call(phone);
        operator.call(social);
    }
}
