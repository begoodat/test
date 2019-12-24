package com.example.vendingmachine;

public abstract class VendingMachineException extends RuntimeException {
    protected String errorMessage;

    VendingMachineException(String errorMessage){
        this.errorMessage = errorMessage;
    }

    VendingMachineException(Throwable t){
        super(t);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorType(){
        return this.getClass().getSimpleName();
    }

    @Override
    public String getMessage() {
        if(this.errorMessage==null || this.errorMessage.length()==0){
            String errorMessage = String.format("%s : %s (%s)", getErrorType(), getErrorMessage(), super.getMessage());
            return errorMessage;
        } else {
            return this.errorMessage;
        }
    }
}