package com.example.vendingmachine;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuRepository extends CrudRepository<Menu, String> {
    @Override
    List<Menu> findAll();
}
