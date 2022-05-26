package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        for (int a = 1; a <= 10; a++) {
//            System.out.println(a * 5);

//        Scanner scanner = new Scanner(System.in);
//
//        for (int a = 1; a <= 10; a++) {
//            System.out.println(Math.pow(2, a));

//        Scanner scanner = new Scanner(System.in);
//
//        for (int a = 1; a <= 10; a++) {
//            a*=2;
//            System.out.println(Math.pow(2+" * " + a + " = ",+ b));

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//       int count = 0;
//        for (; a < b; a++) {
//            if (a % 2 == 1)
//                count +=a;}
//            System.out.println(count);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 1;
        for (; a == 0; a++) {
            if (a+count)
                count +=a;}
        System.out.println(count);
        }

    }