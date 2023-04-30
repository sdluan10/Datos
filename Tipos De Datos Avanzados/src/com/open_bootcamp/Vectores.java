package com.open_bootcamp;

import java.awt.font.FontRenderContext;
import java.time.Instant;
import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(16);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);


//        System.out.println("datos del vector: " + vector);
//
//
//        System.out.println("vector tamanio: " + vector.size() + " y capacidad: " + vector.capacity());

        //comparar vectores

//        Vector<Integer> vector2 = new Vector(1,4);
//        vector2.add(1);
//        vector2.add(2);
//        vector2.add(3);
//
//        boolean resultado = vector.equals(vector2);
//        System.out.println("son iguales: " + resultado);

        //RECORRER VECTOR

//        for (int i : vector){
//            System.out.println("Valor actual en vector: " + i);
//        }
//
//        for (int i = 0; i < vector.size(); i++){
//            if ( i % 2 ==0){
//                vector.remove(i);
//                continue;
//            }
//            System.out.println("valor es: " + vector.get(i) + " en posicion: " + i);
//        }

        //ERROR VOLUNTARIO

//        System.out.println(vector.get(2));
//        vector.remove(2);
//        System.out.println(vector.get(2));

        System.out.println("Capacidad: " + vector.capacity() + " Tamanio: " + vector.size());
        vector.trimToSize();
        System.out.println("Capacidad: " + vector.capacity() + " Tamanio: " + vector.size());

    }
}
