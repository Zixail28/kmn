package com.test.agada;

import java.security.NoSuchAlgorithmException;
import java.util.*;
import com.test.agada.*;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        //for (String str : args) {
        //    System.out.println("Argument = " + str);
        //}
        int computer = (int)(Math.random()*args.length) +1;

        KeyGen key = new KeyGen();
        key.generate();


        String[] params = new String[args.length];
        for (int a = 0; a <= args.length-1; a++) {
            params[a] = (args[a]);
        }

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



        System.out.println("Available moves:");
//        for (String debug : params) {                    //Показывает дебаг полученых аргументов
//            System.out.println("Argument = " + debug);
//        }
        for (int a = 0; a <= args.length-1; a++) {
            System.out.println(a + 1 + " - " + params[a]);
        }
        System.out.println("0 - exit");
        System.out.println("? - help");



        List<String> arrayList = Arrays.asList(args);
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move:");

        int a = scanner.nextInt();
        System.out.println(a);



/*         for (String s : arrayList) {
            Integer count = map.computeIfAbsent(s, key -> 0);
            map.put(s, count + 1);
        }
       for (String s : arrayList){
            if(map.get(s) > 1){
                System.err.println("Strings cannot be repeated!");
                break;
            }
        }
        if(args.length%2 == 0 || args.length<3){
            System.err.println("An odd number of lines or / or less than 3 entered!");
        }
        else{
            System.out.println("Make your choose:");
            for(int l = 0; l < args.length; l++ ){
                System.out.println((l+1)+" -> "+ args[l]);
            }

        }  */
    }
}