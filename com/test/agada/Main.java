package com.test.agada;

import java.security.NoSuchAlgorithmException;
import java.util.*;
import com.test.agada.*;
import com.freva.asciitable.*;

public class Main {

    public static void validationParams(String[] params){
        if(params.length%2 == 0 || params.length<3){
            System.err.println("An odd number of lines or / or less than 3 entered! Example: java -jar game.jar rock paper scissors");
            System.exit(0);
        }
        for (int i = 0; i < params.length-1; i++) {
            for (int j = i+1; j < params.length-1; j++) {
                if(params[i].equalsIgnoreCase(params[j])) {
                    System.err.println("Strings cannot be repeated! Example: java -jar game.jar rock paper scissors");
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String[] params = new String[args.length];
        for (int a = 0; a <= args.length-1; a++) {
            params[a] = (args[a]);
        }
        validationParams(params);
        int computer2 = (int)(Math.random()*args.length) +1;
        String computer = Integer.toString(computer2);
        //System.out.println(computer); // Выводит в консоль что выбрал компьютер
        KeyGen key = new KeyGen();
        key.generate(computer, params, computer2, args);
    }
}