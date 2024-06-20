package com.felipesantos2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> pokemon = new ArrayList<>();

        System.out.println(pokemon.add("pikachu"));
        System.out.println(pokemon.add("zeraora"));
        System.out.println(pokemon.add("venosaur"));
        System.out.println(pokemon.add("chikorita"));

        Collections.sort(pokemon);

        System.out.println(pokemon);
    }
}