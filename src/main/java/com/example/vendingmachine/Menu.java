package com.example.vendingmachine;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Menu {
    @Id
    private String name;
    private BigInteger price;

    public Menu(String name, BigInteger price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
