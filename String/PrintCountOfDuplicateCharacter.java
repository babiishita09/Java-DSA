package String;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintCountOfDuplicateCharacter {

    static void printCountOfDuplicateCharacter(String s){

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0; i< s.length(); i++){
            char c= s.charAt(i);

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
//        map.entrySet().stream()
//                .filter(e->e.getValue()>1)
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .forEachOrdered(System.out::println);

        map.entrySet().stream()
                .filter(e->e.getValue()>1)
                .sorted((e1,e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(System.out::println);

//        System.out.println(map);
    }

    public static void main(String args[]){
        String s= "        (            _ _ )(_)";
        printCountOfDuplicateCharacter(s);

    }
}
