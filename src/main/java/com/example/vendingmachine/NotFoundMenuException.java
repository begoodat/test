package com.example.vendingmachine;

public class NotFoundMenuException extends VendingMachineException {

    NotFoundMenuException(String errorMessage) {
        super(errorMessage);
    }
}
