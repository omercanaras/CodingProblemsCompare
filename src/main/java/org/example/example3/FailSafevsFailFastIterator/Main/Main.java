package org.example.example3.FailSafevsFailFastIterator.Main;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) throws Exception {
    }


    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(1000));
        }
        return list;
    }



}