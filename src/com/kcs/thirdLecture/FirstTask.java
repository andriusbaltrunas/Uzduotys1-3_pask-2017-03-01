package com.kcs.thirdLecture;

import com.kcs.utils.MyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 3/1/2017.
 */
public class FirstTask {

    public static void main(String[] args) {
        //ArrayList<String> names = new LinkedList();
        // List<String> names = new ArrayList<>();

        List<String> names = new ArrayList<>();
        readFile("persons.txt", names);
        Collections.sort(names); //sorting [A-Z]
        MyUtils.printList(names);
        writeFile(names, "persons.txt");

    }

    private static void writeFile(List<String> names, String fileName){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName)));
            for (String name : names){
                bw.write(name);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Can`t write to file >> " + fileName);
        }
    }

    private static void readFile(String fileName, List<String> names) {
        File file = new File(fileName);
        try {
            FileReader reader = new FileReader(file);
            //BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
            BufferedReader bf = new BufferedReader(reader);
            String name = null;

            try {
                while ((name = bf.readLine()) != null) {
                    names.add(name);
                }
            } catch (IOException e) {
                System.out.println("Can`t read line " + e);
            } finally {
                try {
                    bf.close();
                } catch (IOException e) {
                    System.out.println("Can`t close reader, " + e);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can`t find file >> " + fileName);
        }

    }
}
