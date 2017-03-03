package com.kcs.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by andriusbaltrunas on 3/2/2017.
 */
public class MyMainApp {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(2,4,56,6);

        Iterator<Integer> iterator = names.iterator();
        ///iterator.hasNext() -> check or exist next element
        //iterator.next() - > take a element
        //iterator.remove(); -> remove
        int i = 1;
        while (iterator.hasNext()){
            iterator.next();
            if (i % 2 == 0){
                iterator.remove();
            }
            i++;
        }
        //names.size()
    }
}
