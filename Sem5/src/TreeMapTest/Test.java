package TreeMapTest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Test {

    public static TreeMap<String,Integer> sortHashMap(HashMap<String,Integer> notSortedMap)
    {
        TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(
            new Comparator<String>(){
                @Override
                public int compare(String s1, String s2)
                {
                    return Integer.compare(s1.length(),s2.length());
                }
            }
        );
        sortedMap.putAll(notSortedMap);
        return sortedMap;
    }

    // public static TreeMap<String, Integer> sortHashMap(HashMap<String, Integer> notSortMap) {
    //     TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(notSortMap);
    //     new Comparator<String>(){
    //         @Override
    //         public int compare(String s1, String s2)
    //         {
    //             return Integer.compare(s1.length(), s2.length());
    //         };
    //     };
    //     return sortedMap;
    // }
    
}
