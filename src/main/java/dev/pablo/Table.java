package dev.pablo;

public class Table {

    public static void main(String[] args) {
        int n = 5;
        String[] table = generateTable(n);

        for (String line : table) {
            System.err.println(line);
        }
    }

public static String[] generateTable(int n) {
    String[] table = new String[10];

    for (int i = 1; i <= 10; i++) {
            table[i - 1] = n + " x " + i + " = " + (n * i);
        }
        return table;
    }
}