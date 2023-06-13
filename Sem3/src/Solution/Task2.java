package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    

    public static ArrayList<String> randomFill(String[] plans) {
        ArrayList<String> planets = new ArrayList<>();
       // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter array size: ");
        int n = 15;// sc.nextInt();
       // sc.close();
        for (int i = 0; i < n; ++i) {
            planets.add(plans[(int) (Math.random()* plans.length)]);
        }
        System.out.println(planets);
        return planets;      
    }

    public static HashMap<String, Integer> namesCounts(ArrayList<String> planets) {
        HashMap<String, Integer> dict = new HashMap<>();
        for (String string : planets) {
            if (dict.keySet().contains(string)) {
                dict.put(string, dict.get(string) + 1);
            } else {
                dict.put(string, 1);
            }
        }
        return dict;     
    }

    public static void planetsFreq() {
        String[] pl = { "Меркурий", "Венера", "Венера", "Марс", "Земля", "Юпитер", "Сатурн", "Уран", "Нептун" };
        List<String> planetsList = Arrays.asList(pl);
        Set<String> planetsSet = new HashSet<>(planetsList);
        for (String planets : planetsSet) {
            System.out.println(planets + " = " + Collections.frequency(planetsList, planets));
        }
        System.out.println(planetsSet);
    }
}