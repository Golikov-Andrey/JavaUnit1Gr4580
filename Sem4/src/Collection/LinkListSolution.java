package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class LinkListSolution {

    private static LinkedList<String> list = new LinkedList<>();

    public static void run() {
        boolean getIteration = true;

        while (getIteration) {
            String cmd = InputUser("Enter the command");
            String[] cLine = cmd.toUpperCase().split("~");
            // 11111~5
            switch (cLine[0]) {
                case "EXIT":
                    getIteration = false;
                    break;
                case "PRINT":
                    System.out.println(list.get(Integer.parseInt(cLine[1])));
                    break;
                case "LIST":
                    while (list.size() > 0) {
                        System.out.println(list.pop());
                    }
                    break;
                default:
                    if (cLine.length > 1) {
                        if (isInt(cLine[1])) {
                            adder(cLine, list);
                        } else {
                            list.addFirst(cLine[0]);
                        }
                    } else {
                        list.addFirst(cLine[0]);
                    }
                    break;
            }
        }
    }

    private static String InputUser(String message) {
        System.out.print(message + " -> ");
        Scanner scannerNumber = new Scanner(System.in);
        return scannerNumber.nextLine();
    }

    private static boolean isInt(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static List<String> adder(String[] splitted, List<String> list) {
        if (isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            if (num > list.size()) {
                for (int i = list.size() - num; i < num + 1; ++i) {
                    list.add(" ");
                }
            }
            list.add(num, splitted[0]);
        }
        return list;
    }
}
