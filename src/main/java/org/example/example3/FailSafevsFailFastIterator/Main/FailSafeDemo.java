package org.example.example3.FailSafevsFailFastIterator.Main;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
class FailSafeDemo {
    public static void main(String args[])
    {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 7, 9, 11 });
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer)itr.next();
            System.out.println(i);
            if (i == 7)
                list.add(15);
        }
    }
}