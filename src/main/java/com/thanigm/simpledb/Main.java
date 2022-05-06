package com.thanigm.simpledb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (true) {
            System.out.print("Cmd >> ");
            String input = in.nextLine();
            System.out.println(input);
        }
    }
}
