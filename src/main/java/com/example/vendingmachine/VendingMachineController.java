package com.example.vendingmachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class VendingMachineController {
    @Autowired
    VendingMachineService vendingMachineService;

    @PostMapping("/add")
    public String add(Menu menu){

    }

    @PostMapping("/listAll")
    public Map<String, Menu> listAll(){
        return vendingMachineService.listMenu();
    }
}
