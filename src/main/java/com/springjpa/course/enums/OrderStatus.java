package com.springjpa.course.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
    // verificando se codigo existe no enum, caso exista ele retorna o enum
    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Código inválido");
    }
}
