package com.example.vendingmachine;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface MenuService {
    String addMenu(Menu menu);
    String editMenu(Menu menu);
    String deleteMenu(String id);
    List<Menu> getMenuList();
}
