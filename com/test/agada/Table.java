package com.test.agada;

import com.freva.asciitable.AsciiTable;

public class Table {

    public static void drawTable(String[] args, String[] params, int computer2, String secretKey) {
        Rules rules = new Rules();
        if (params.length == 3) {
            String[] headers = {"PC \\ User", params[0], params[1], params[2]};
            String[][] data = {
                    {params[0], "DRAW", "WIN", "LOSE"},
                    {params[1], "LOSE", "DRAW", "WIN"},
                    {params[2], "WIN", "LOSE", "DRAW"}
            };
            System.out.println(AsciiTable.getTable(headers, data));
            rules.rules2();
        } else if (params.length == 5) {
            String[] headers = {"PC \\ User", params[0], params[1], params[2], params[3], params[4]};
            String[][] data = {
                    {params[0], "DRAW", "WIN", "WIN", "LOSE", "LOSE"},
                    {params[1], "LOSE", "DRAW", "WIN", "WIN", "LOSE"},
                    {params[2], "LOSE", "LOSE", "DRAW", "WIN", "WIN"},
                    {params[3], "WIN", "LOSE", "LOSE", "DRAW", "WIN"},
                    {params[4], "WIN", "WIN", "LOSE", "LOSE", "DRAW"}
            };
            System.out.println(AsciiTable.getTable(headers, data));
            Rules.rules(args, params, computer2, secretKey);
        } else if (params.length == 7) {
            String[] headers = {"PC \\ User", params[0], params[1], params[2], params[3], params[4], params[5], params[6]};
            String[][] data = {
                    {params[0], "DRAW", "WIN", "WIN", "WIN", "LOSE", "LOSE", "LOSE"},
                    {params[1], "LOSE", "DRAW", "WIN", "WIN", "WIN", "LOSE", "LOSE"},
                    {params[2], "LOSE", "LOSE", "DRAW", "WIN", "WIN", "WIN", "LOSE"},
                    {params[3], "LOSE", "LOSE", "LOSE", "DRAW", "WIN", "WIN", "WIN"},
                    {params[4], "WIN", "LOSE", "LOSE", "LOSE", "DRAW", "WIN", "WIN"},
                    {params[5], "WIN", "WIN", "LOSE", "LOSE", "LOSE", "DRAW", "WIN"},
                    {params[6], "WIN", "WIN", "WIN", "LOSE", "LOSE", "LOSE", "DRAW"}
            };
            System.out.println(AsciiTable.getTable(headers, data));
        }
    }
}
