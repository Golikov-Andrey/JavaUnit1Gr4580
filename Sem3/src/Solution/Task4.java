package Solution;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void task4()
    {
        List<List<String>> library = new ArrayList<>();

        List<String> g1 = new ArrayList<String>();
        g1.add("проза");
        g1.add("война и мир");
        g1.add("12 стульев");

        library.add(g1);

        List<String> g2 = new ArrayList<String>();
        g2.add("поэзия");
        g2.add("бородино");
        library.add(g2);

        System.out.println(library);
    }
    
}
