package org.kw.lab1;

/**
 * Class representing a customer.
 */
public class Client {
    /**
     * name of the customer.
     */
    private final String clientName;

    /**
     * Creates a Client object with specified name.
     * @param name the name of the customer
     */
    public Client(final String name) {
    this.clientName = name;
    }

    /**
     * Gets the name of the customer.
     * @return name of the customer
     */
    public String getName() {
        return this.clientName;
    }

}
