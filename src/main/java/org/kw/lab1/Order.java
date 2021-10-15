package org.kw.lab1;

/**
 * Class representing an order.
 */
public class Order {
    /** client who made the order.*/
    private final Client client;
    /** name of the ordered object. */
    private final String item;

    /**
     * Create an order with specified customer and name of an ordered object.
     * @param customer client who made the order
     * @param obj name of the ordered object
     */
    public Order(final Client customer, final String obj) {
        client = customer;
        item = obj;
    }

    /**
     * Get information about the order.
     * @return message containing the
     * name of the client and the name of an object.
     */
    public String getInfo() {
        return "Customer " + client.getName() + " ordered " + item + ".";
    }
}
