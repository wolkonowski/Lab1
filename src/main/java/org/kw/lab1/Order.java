package org.kw.lab1;

public class Order {

    Client client;
    String item;
    public Order(Client c, String obj) {
        client=c;
        item=obj;
    }
    public String getInfo()
    {
        return "Customer "+client.getName()+" ordered "+item+".";
    }
}
