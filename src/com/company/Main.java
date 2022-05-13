package com.company;

public class Main {

    public static void main(String[] args) {
        Reader vetor[] = new Reader [3];
        for (int i = 0; i < 3; i++) {
            vetor[i] = new Reader();
            vetor[i].escanear();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("|" + vetor[i].i + "|");
            System.out.println("|" + vetor[i].s + "|");
        }
    }
}
