package com.kcs.secondLecture;

import java.util.Scanner;

/**
 * Created by User on 2017-02-28.
 */
public class SecondExample {

    private static final String END = "pabaiga";
    private static final String TEXT = "Please insert o word";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (!name.equals(END)){
            System.out.println(TEXT);
            name = scanner.nextLine();
        }

       /* while (true){
            String name1 = scanner.nextLine();
            if(name1.equals(END)){
                break;
            }
        }*/
    }
}
