package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.print("Sayi girin : ");
        int number = input.nextInt();

        while (number != 0){
            result += number%10;
            number /= 10;
        }
        System.out.println(result);


    }
}