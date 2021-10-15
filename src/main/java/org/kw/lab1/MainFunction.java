package org.kw.lab1;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to execute the application.
 */
public class MainFunction {
    /**
     *
     * @param args args parsed from command line
     */

    public static void main(final String[] args) {
        List<Order> list = new ArrayList<Order>();
        Client bob = new Client("Bob");
        Order ord1 = new Order(bob,"chair");
        list.add(ord1);
        Client alice = new Client("Alice");
        Order ord2 = new Order(alice,"table");
        list.add(ord2);
        for(Order o:list)
        {
            System.out.println(o.getInfo());
        }
    }
}
