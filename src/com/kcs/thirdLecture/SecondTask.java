package com.kcs.thirdLecture;

import com.kcs.thirdLecture.vo.Car;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by andriusbaltrunas on 3/1/2017.
 */
public class SecondTask {

    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        readFile("cars.txt", cars);
        printSet(cars);
    }


    private static void printSet(Set<Car> cars){
        for (Car car: cars){
            System.out.println(car);
        }
    }

    private static void readFile(String fileName, Set<Car> cars){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
            String line = null;
            while ((line = bf.readLine()) != null){
                addCar(line, cars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addCar(String line, Set<Car> cars){
        String[] items = line.split("\t");
        if(items.length == 3){
            cars.add(new Car(items[0], items[1], items[2]));
        }
    }
}
