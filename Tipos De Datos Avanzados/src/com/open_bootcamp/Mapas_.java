package com.open_bootcamp;

import java.util.HashMap;
import java.util.Map;

public class Mapas_ {

    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave 1", 10);
        mapa.put("clave 2", 20);
        mapa.put("clave 3", 30);

       // System.out.println(mapa);
        //System.out.println(mapa.get("clave2"));

        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }

    }
}
