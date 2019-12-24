package com.example.vendingmachine;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VendingMachineRepository extends CrudRepository<VendingMachine, String> {
    @Override
    List<VendingMachine> findAll();
}
