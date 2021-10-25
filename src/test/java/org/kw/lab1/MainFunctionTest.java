package org.kw.lab1;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainFunctionTest  {


    @Test
    public void createClient() {
        Client bob = new Client("Bob");
        assertEquals("Bob", bob.getName());
    }
    @Test
    public void createOrder() {
        Client bob = new Client("Bob");
        Order order = new Order(bob, "chair");
        assertEquals("Customer Bob ordered chair.", order.getInfo());
    }
}