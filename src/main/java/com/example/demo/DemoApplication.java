package com.example.demo;

import com.example.vendingmachine.Menu;
import com.example.vendingmachine.VendingMachine;
import com.example.vendingmachine.VendingMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    VendingMachineRepository vendingMachineRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    public void run(){

        String type = VendingMachine.type.DRINK.name();
        String loacation = "Seoul";
        String owner = "roh";
        String ownerContract = "01012345678";
        List<Menu> menuList = new ArrayList<>();

        VendingMachine vendingMachine = new VendingMachine(type, loacation, owner, ownerContract, menuList);
        vendingMachine
    }

}
