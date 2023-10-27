package ua.edu.ucu.apps.flowerstoretest.deliverytest;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.order.Order;

public class DeliveryTest {
    private DHLDeliveryStrategy dhlDelivery;
    private PostDeliveryStrategy postDelivery;

    @BeforeEach
    public void init(){
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
    }

    @Test
    public void testDelivery(){
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        List<Order> ordersPost = List.of(order1, order2);
        List<Order> ordersDHL = List.of(order1, order2, order3);
        Assertions.assertEquals("We are delivery your 2 items by Nova Poshta", postDelivery.orderDelivery(ordersPost)); 
        Assertions.assertEquals("We are delivery your 3 items by DHL", dhlDelivery.orderDelivery(ordersDHL)); 
    }
}
