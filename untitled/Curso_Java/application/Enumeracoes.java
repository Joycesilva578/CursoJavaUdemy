package application;

import enums.OrderStatus;

import java.util.Date;

public class Enumeracoes {
    public static void main(String[] args) {
        OrderStatus.Order order = new OrderStatus.Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
