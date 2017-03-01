package com.kcs.utils;

import java.util.List;

/**
 * Created by andriusbaltrunas on 3/1/2017.
 */
public class MyUtils {

    public static <E> void printList(List<E> list){
        for(E e : list){
            System.out.println(e);
        }
    }
}
