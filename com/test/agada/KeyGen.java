package com.test.agada;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import com.test.agada.*;

public class KeyGen {

    public void generatorSecond(String computer, String[] args, String[] params, int computer2, String secretKey) throws NoSuchAlgorithmException {
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        byte[] bytes = sha.digest(computer.getBytes());
        StringBuilder builder = new StringBuilder();
        for(byte b1 : bytes) {
            builder.append(String.format("%02X", b1));
        }
        //System.out.println(builder.toString());

        String hmac = (builder.toString()); // HMAC = key + params[computer2-1] | Пример = D5E3F748D602F80433125402F8D59FC1paper
        System.out.print("HMAC: ");
        System.out.println(hmac);
        Rules.rules(args, params, computer2, secretKey);
    }


    public void generate(String computer, String[] params, int computer2, String[] args) throws NoSuchAlgorithmException {

        SecureRandom random = new SecureRandom();
        byte[] seed = random.generateSeed(16);
        StringBuilder builder = new StringBuilder();
        for(byte b1 : seed) {
            builder.append(String.format("%02X", b1));
        }

        String secretKey = (builder.toString()); // Секретный ключ
        //System.out.println(secretKey); // Выводит Секретный ключ в консоль
        String Key = builder.toString() + params[computer2-1];
        //System.out.println(builder.toString() + params[computer2-1]); // ХЗ
        generatorSecond(Key, args, params, computer2, secretKey);
    }
}