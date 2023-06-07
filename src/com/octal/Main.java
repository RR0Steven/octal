package com.octal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero octal (0-7): ");
        int octal = scanner.nextInt();

        if (octal >= 0 || octal > 7) {
        	String binaryNumber = conversor(octal);
            System.out.println("Numero binario correspondiente: " + binaryNumber);
        } else {
        	System.out.println("El numero debe ser positivo y estar en el rango de 0 a 7.");
        }

        scanner.close();
    }

    public static String conversor(int octalNumber) {
        String binaryNumber = "";

        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            switch (remainder) {
                case 0:
                    binaryNumber = "000 " + binaryNumber;
                    break;
                case 1:
                    binaryNumber = "001 " + binaryNumber;
                    break;
                case 2:
                    binaryNumber = "010 " + binaryNumber;
                    break;
                case 3:
                    binaryNumber = "011 " + binaryNumber;
                    break;
                case 4:
                    binaryNumber = "100 " + binaryNumber;
                    break;
                case 5:
                    binaryNumber = "101 " + binaryNumber;
                    break;
                case 6:
                    binaryNumber = "110 " + binaryNumber;
                    break;
                case 7:
                    binaryNumber = "111 " + binaryNumber;
                    break;
            }
            octalNumber /= 10;
        }

        return binaryNumber;
    }
}