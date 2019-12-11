package com.example.vendingmachine;

import java.util.Map;
import java.util.UUID;

public class VendingMachineService {
    private Map<String, Menu> menuMap;

    public String addMenu(Menu menu){
        String id = UUID.randomUUID().toString();
        menuMap.put(id, menu);
        return String.format("menu(%s) add success", menu.toString());
    }

    public String editMenu(String id, Menu menu) {
        if(menuMap.containsKey(id)){
            menuMap.replace(id, menu);
        }
        return String.format("menu(%s) edit success", menu.toString());
    }

    public Map<String, Menu> listMenu() {
        return menuMap;
    }

    public String deleteMenu(String id) {
        Menu menu = menuMap.get(id);
        menuMap.remove(id);
        return String.format("menu(%s) delete success", menu.toString());
    }
}
