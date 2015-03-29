package com.amar.CommandPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 25/09/14
 * Time: 12:35 AM
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
