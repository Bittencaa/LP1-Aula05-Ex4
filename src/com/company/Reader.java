package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {
    int i;
    String s;
    Scanner scan = new Scanner(System.in);

    public void escanear(){
        try{
            System.out.println("Entre com um inteiro: ");
            i = scan.nextInt();

            System.out.println("Entre com uma string: ");
            s = scan.next();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
