/*
Реализуйте алгоритм сортировки пузырьком числового массива,
        результат после каждой итерации запишите в лог-файл.*/

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Test {

    public static void Logging() {

        Logger logger = Logger.getLogger(Task2.class.getName());
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);

        try {
            FileHandler fh = new FileHandler("log_bubble_sort.xml");
            logger.addHandler(fh);

            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);

            BubbleSortWithLog(logger);

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

     public static void BubbleSortWithLog(Logger logger) {

         int[] mas = {11, 100, 45, 7, 14, 99, 1, 0, 509, 3, 78, 22};

         boolean isSorted = false;
         int buf;

         System.out.println(mas);

         while (!isSorted) {
             isSorted = true;
             for (int i = 0; i < mas.length - 1; i++) {
                 if (mas[i] > mas[i + 1]) {
                     isSorted = false;
                     logger.info(mas[i] +" - "+mas[i + 1]);

                     buf = mas[i];
                     mas[i] = mas[i + 1];
                     mas[i + 1] = buf;
                    // Logging();
                 }
             }
         }
         System.out.println("----------------Task2----------------");
         System.out.println(Arrays.toString(mas));
     }
}
