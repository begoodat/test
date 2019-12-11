package com.example.vendingmachine;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class VendingMachine {
    private String id;
    private String type;
    private String location;
    private String owner;
    private String ownerContract;
    private Map<String, Menu> menu;

    public VendingMachine(String type, String location, String owner, String ownerContract) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.location = location;
        this.owner = owner;
        this.ownerContract = ownerContract;
        this.menu = new HashMap<>();
    }
}
