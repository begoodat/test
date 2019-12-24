package com.example.vendingmachine;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Entity
public class VendingMachine {
    @Id
    private String id;
    private String type;
    private String location;
    private String owner;
    private String ownerContract;
    private List<Menu> menuList;

    public VendingMachine(String type, String location, String owner, String ownerContract, List<Menu> menuList) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.location = location;
        this.owner = owner;
        this.ownerContract = ownerContract;
        this.menuList = menuList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerContract() {
        return ownerContract;
    }

    public void setOwnerContract(String ownerContract) {
        this.ownerContract = ownerContract;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public enum type {
        DRINK;
    }
}
