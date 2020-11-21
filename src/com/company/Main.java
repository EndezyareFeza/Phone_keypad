package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main aPhoneKeypad = new Main();
	aPhoneKeypad.run();
    }
    private void run(){
        Scanner in = new Scanner(System.in);
        String str;
        System.out.print("Please enter a string: ");
        str = in.next();

        int digit = 0;
        for(int i = 0; i < str.length(); i++){
            switch (str.toUpperCase().charAt(i)) {
                case 'A', 'B', 'C' -> digit = 2;
                case 'D', 'E', 'F' -> digit = 3;
                case 'G', 'H', 'I' -> digit = 4;
                case 'J', 'K', 'L' -> digit = 5;
                case 'M', 'N', 'O' -> digit = 6;
                case 'P', 'Q', 'R', 'S' -> digit = 7;
                case 'T', 'U', 'V' -> digit = 8;
                case 'W', 'X', 'Y', 'Z' -> digit = 9;
            }
            System.out.print(digit);
        }
        System.out.println();
        System.out.println("The letters are in this digit code as entered!");
    }
}
