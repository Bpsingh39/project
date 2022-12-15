package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_Example {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap= new HashMap<>();
        hashMap.put(1,"Anil");
        hashMap.put(2,"Rinku");
        hashMap.put(3,"Ganesh");
        System.out.println(hashMap);
        for (Integer var:hashMap.keySet()){
            System.out.println("Key:- "+var);
        }
        for (String var1: hashMap.values()){
            System.out.println("Values:- "+var1);
        }
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Key "+entry.getKey() + " , Values "+entry.getValue());
        }
    }
}
