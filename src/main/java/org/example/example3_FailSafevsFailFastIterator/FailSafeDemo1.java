package org.example.example3_FailSafevsFailFastIterator;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
public class FailSafeDemo1 {
    public static void main(String[] args)
    {

        ConcurrentHashMap<String, Integer> concurrentHashMap
                = new ConcurrentHashMap<String, Integer>();
        concurrentHashMap.put("Bir", 1);
        concurrentHashMap.put("İki", 7);
        concurrentHashMap.put("Beş", 5);
        concurrentHashMap.put("Sekiz", 8);

        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            String key = (String)it.next();
            System.out.println(key + " : " + concurrentHashMap.get(key));
            concurrentHashMap.put("Dokuz", 9);
        }
    }
}