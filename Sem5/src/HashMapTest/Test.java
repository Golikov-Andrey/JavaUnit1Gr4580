package HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class Test {

    //Integer[] intValue,String[] values
    public static HashMap<Integer,String> fill(){//String[] values
        HashMap<Integer,String> outMap = new HashMap<>();
        outMap.put(123456, "Иванов");
        outMap.put(321456, "Васильев");
        outMap.put(234561, "Петров");
        outMap.put(234432, "Иванов");
        outMap.put(654321, "Петров");
        outMap.put(345678, "Иванов");
        return outMap ;
    }

    public static void printHashMap(HashMap<Integer,String> outMap, String searchValue){

        for(Map.Entry<Integer,String> item: outMap.entrySet())
        {
            if(item.getValue()==searchValue)
            {            
                System.out.println(item.getValue()+" - "+item.getKey());
            }
        }
    }

    
}
