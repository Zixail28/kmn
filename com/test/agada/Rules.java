package com.test.agada;

import java.util.*;

public class Rules {

    public static void ktoWin(int myChoice, int computer2, int argsLength, String secretKey) {
        if (myChoice == computer2) {
            System.out.println("You draw!");
        } else if (computer2 > myChoice && computer2 - myChoice > (argsLength / 2)){
            System.out.println("You win!");
        } else if (myChoice > computer2 && myChoice - computer2 < (argsLength / 2)){
            System.out.println("You win!");
        } else {
        System.out.println("You lose!"); }
        System.out.println("HMAC key: " + secretKey);
    }

    public static void rules(String[] args, String[] params, int computer2, String secretKey){
        int argsLength = args.length;
        System.out.println("Available moves:");
        for (int a = 0; a <= args.length-1; a++) {
            System.out.println(a + 1 + " - " + params[a]);
        }
        System.out.println("0 - exit");
        System.out.println("? - help");

        List<String> arrayList = Arrays.asList(args);
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move:");

        String myChoice = scanner.nextLine();
        switch (myChoice) {
            case ("0"):
                System.out.println("exit");
                System.exit(0);
            case ("?"):
                Table.drawTable(args, params, computer2, secretKey);
            default:
                System.out.println("Your move: " + params[Integer.parseInt(myChoice)-1]);
                System.out.println("Computer move: " + params[computer2-1]);
                ktoWin(Integer.parseInt(myChoice), computer2, argsLength, secretKey);
        }
    }

    public void rules2(){

    }
}
