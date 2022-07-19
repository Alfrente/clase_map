package com.arroyo.mapa;

import java.util.HashMap;
import java.util.Map;

public class MapMethodos {
    public static void main(String[] args) {
        Map<String, String> players=new HashMap<>(); //delcaracion
        players.put("Leo Messi","Barcelona"); //añadir informacion
        players.put("CR7","Real Madrid");
        players.put("Falcao",null); //puede tener una llave null y varios valores null
        players.put("CR7 copia","Real Madrid");

        //crear mapa de otro mapa
        // 1 Map<String, String> player2=new HashMap<>(players);

        // 2 Map<String, String> player3=new HashMap<>(players);
        // 2 player3.putAll(players);

        players.putIfAbsent("Falcao","Colombia"); //para anadir valor a una llave si es null
        System.out.println("Falcao es de: " + players.get("Falcao")); //se imprime con el get y la llave

        players.putIfAbsent("Falcao","Panama");
        System.out.println("Falcao es de: " + players.get("Falcao"));

        //Obtener valores en un mapa
        String equipoLeo = players.get("Leo Messi");
        System.out.println("equipo de Leo = " + equipoLeo);

        String equipoDiMaria = players.getOrDefault("Di Maria","No registrado");
        System.out.println("equipo de DiMaria = " + equipoDiMaria);

        //preguntar si la clave esta en un metodo
        if (players.containsKey("CR7")){
            System.out.println("Si esta la clave");
        }

        //preguntar si el valor esta en el mapa
        System.out.println("Se encontro jugador de panama: " +  players.containsValue("panama"));

        //Obtenr todas las llaves
        System.out.println("Jugadores registrados\n" + players.keySet());

        //Obtener todos los valores del mapa
        System.out.println("Equipos registrados: " + players.values());

        //reemplazar uno de los valores en el mapa
        players.replace("Falcao","Peru");
        System.out.println("Falcao juega en " + players.get("Falcao"));

        //Eliminar una llave y valor
        System.out.println("CR7 copia esta en el mapa: " + players.containsKey("CR7 copia"));
        players.remove("CR7 copia");
        System.out.println("CR7 copia esta en el mapa: " + players.containsKey("CR7 copia"));

        //Tamano del mapa
        System.out.println("Tamaño mapa " + players.size());

        //saber si el mapa esta vacio
        System.out.println("El mapa esta vacio: " + players.isEmpty());

        //Limpiar el mapa
        players.clear();
        System.out.println("El mapa esta vacio: " + players.isEmpty());

    }
}
