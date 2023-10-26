package Collections;

import java.util.HashMap;
import java.util.Map;

public class Collection3 {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"AUDI");  //Put elements in Map
        map.put(2,"BMW");
        map.put(3,"CADILLAC");
        map.put(4,"DODGE");

       /* System.out.println("Iterating Hashmap...");
        for(Map.Entry  m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
        System.out.println(map);
    }
}
