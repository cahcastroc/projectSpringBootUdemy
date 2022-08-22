package com.camila.shopspringboot.project_springBoot.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    //Para que fique acessível ao exterior

    public int getCode(){
        return code;
    }

    //Converter um valor númerico para um valor enumerado
    //Método statico pq ele vai funcionar sem precisar instanciar

    public static OrderStatus convert(int code){
        for (OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Código Inválido");
    }
}
