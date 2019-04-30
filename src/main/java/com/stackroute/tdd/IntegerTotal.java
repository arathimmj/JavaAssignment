package com.stackroute.tdd;

import java.util.Scanner;

public class IntegerTotal {
    public void findTotal() {

        int total = 0;
        Scanner input = new Scanner(System.in);

        int number;

        while ((number = input.nextInt()) != 0) {
            total = total + number;
        }
        System.out.println(total);
    }
}
