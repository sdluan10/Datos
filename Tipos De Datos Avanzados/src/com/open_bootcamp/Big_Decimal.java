package com.open_bootcamp;

import java.math.BigDecimal;

public class Big_Decimal {

    public static void main(String[] args) {

        BigDecimal valorA = new BigDecimal(3.14f);
        BigDecimal valorB = new BigDecimal(3.15f);

        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado.toString());
    }
}
