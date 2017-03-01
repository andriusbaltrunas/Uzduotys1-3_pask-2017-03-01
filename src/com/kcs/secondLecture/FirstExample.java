package com.kcs.secondLecture;


import java.util.Scanner;

/**
 * Created by User on 2017-02-28.
 */
public class FirstExample {

    public static void main(String[] args) {
        System.out.println("Please insert a number!");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        System.out.println(getText(numb));
    }

    private static String getText(int numb){
        String text = "This number is odd";
        if(numb % 2 == 0){
            text = "This number is even";
        }
        return text;
    }
}
