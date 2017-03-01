package com.kcs.firstLecture.task1;

import java.util.Scanner;

/**
 * Created by User on 2017-02-27.
 */
public class FirstExample {

    public static void main(String[] args) {
        System.out.println("Please insert your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("You inserted >> " +name);
    }
}
