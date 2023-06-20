package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest {

    public static void TimeTest(int size) {

        Random rnd = new Random();
        List<Integer> simpleList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();

        // ArrayList<Integer> simpleList1 = new ArrayList<>();
        // LinkedList<Integer> linkList1 = new LinkedList<>();

        long curTime = System.currentTimeMillis();
        System.out.println(curTime);
        
        curTime = System.currentTimeMillis();
        for(int i =0;i<size;i++)
        {
            simpleList.add(1);
        }
        System.out.println("Простой список конец "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0;i<size;i++)
        {
            linkList.add(1);
        }
        System.out.println("Связный список конец "+(System.currentTimeMillis()-curTime));

        simpleList.clear();
        linkList.clear();
        
        curTime = System.currentTimeMillis();
        for(int i =0;i<size/10;i++)
        {
            simpleList.add(0,1);
        }
        System.out.println("Простой список начало "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0;i<size/10;i++)
        {
            linkList.add(0, 1);
        }
        System.out.println("Связный список начало "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0;i<size/10;i++)
        {
            simpleList.add(rnd.nextInt(10000),1);
        }
        System.out.println("Простой список середина "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0;i<size/10;i++)
        {
            linkList.add(rnd.nextInt(10000), 1);
        }
        System.out.println("Связный список середина "+(System.currentTimeMillis()-curTime));

    }



//     public class Task1 {
//     public static void main(String[] args) {
//         final int N = 10000;
//         System.out.println("Добавления 100 элементов в ArrayList: ");
//         System.out.println(getTime(()-> addElementsInList(new ArrayList<>(), N)));
//         System.out.println("Добавление элементов в LinkedList: ");
//         System.out.println(getTime(()-> addElementsInList(new LinkedList<>(), N)));
//     }
//     public static void addElementsInList(List<Integer> list, int count){
//         for(int i = 0; i < count; i++){
//             list.add(i);
//         }
//     }
//     public static long getTime(Runnable r){
//         long result = System.currentTimeMillis();
//         r.run();
//         result = System.currentTimeMillis() - result;
//         return result;
//     }
// }

// public static void timeTest(int size) {
//         Date begin = new Date();
//         ArrayList<Integer> al = new ArrayList<>();
//         for (int i = 0; i < size; ++i) {
//             al.add(153);
//         }
//         Date end = new Date();
//         System.out.println("ArrayList");
//         System.out.println(end.getTime() - begin.getTime());
//         System.out.println();

//         begin = new Date();
//         LinkedList<Integer> ll = new LinkedList<>();
//         for (int i = 0; i < size; ++i) {
//             ll.add(153);
//         }
//         end = new Date();
//         System.out.println("LinkedList");
//         System.out.println(end.getTime() - begin.getTime());
//     }

// public static ArrayList GetIntArray(int size, int maxLimit) {
//         ArrayList<Integer> result=new ArrayList<>();
//         Random r=new Random(); 
//         int i=0;
//         while (i<size){
//             result.add(r.nextInt(maxLimit));
//             i++;
//         }
//         return result;
//     }

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;

// public class ListTest {
//     public static void run1() {
//         int numElements = 10000000;

//         // Measure time for ArrayList
//         long startTimeArrayList = System.currentTimeMillis();
//         addElementsToArrayList(numElements);
//         long endTimeArrayList = System.currentTimeMillis();
//         long durationArrayList = endTimeArrayList - startTimeArrayList;

//         // Measure time for LinkedList
//         long startTimeLinkedList = System.currentTimeMillis();
//         addElementsToLinkedList(numElements);
//         long endTimeLinkedList = System.currentTimeMillis();
//         long durationLinkedList = endTimeLinkedList - startTimeLinkedList;

//         // Print the results
//         System.out.println("Time taken to add " + numElements + " elements to ArrayList: " + durationArrayList + "ms");
//         System.out.println("Time taken to add " + numElements + " elements to LinkedList: " + durationLinkedList + "ms");
//     }

//     private static void addElementsToArrayList(int numElements) {
//         List<Integer> arrayList = new ArrayList<>();
//         for (int i = 0; i < numElements; i++) {
//             arrayList.add(i);
//         }
//     }
}
