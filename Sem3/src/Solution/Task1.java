package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    static Random random = new Random();
    public static List<Integer> generateRandomIntegers(int count){
        return Stream.generate(random::nextInt).limit(count).collect(Collectors.toList());
    }
    public static void execute() {
        List<Integer> integers = generateRandomIntegers(10);
        System.out.println(integers);
        integers.sort(Integer::compareTo);
        System.out.println(integers);
    }


    public static void filler(){
        ArrayList<Integer> array = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; ++i){
            array.add(rnd.nextInt(100));
        }
        System.out.println(array);

        Collections.sort(array);

        System.out.println(array);        
    }
}
