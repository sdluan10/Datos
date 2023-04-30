package com.open_bootcamp;

public class StringsAvanzados {

    public static void main(String[] args) {
        String cadena = "mensaje de texto";

        // LONGITUD DE UNA CADENA

//        int cadenaLen = cadena.length();
//        System.out.println("la longitud de la cadena es de : " + cadenaLen);

        //CONVERTIR CADENA DE MAYUSCULA A MINUSCULA Y VICEVERSA
//
//        String cadenaMinus = cadena.toLowerCase();
//        System.out.println("la cadena ahora es: " + cadenaMinus);
//
//        String cadenaMayus = cadena.toUpperCase();
//        System.out.println("la cadena ahora es: " + cadenaMayus);

        //LA CADENA EMPIEZA POR LOS CARACTERES QUE BUSCO

//        boolean resultado = cadena.startsWith("mn");
//        if (resultado){
//            System.out.println("Empieza por lo que estoy buscando");
//        } else {
//            System.out.println("No empieza por lo que quiero");
//        }

        //QUE CARACTER ESTA EN LA POSICION QUE QUIERO

//        char letra = cadena.charAt(4);
//        System.out.println("caracter es: " + letra);

        //RECORRER CADENA CON EL BUCLE "FOR"

        for (int i = 0; i < cadena.length(); i++){
            System.out.println("caracter actual: " + cadena.charAt(i));
        }

    }
}
