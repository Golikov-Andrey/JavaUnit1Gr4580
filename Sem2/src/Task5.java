import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task5 {

    public static String[] getCrntFldrCnts() {
        File folder = new File(".");
        return folder.list();
    }

    public static void wrtArrToFile(String[] array, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String item : array) {
                writer.write(item);
                writer.write(System.lineSeparator());
            }
            System.out.println("Успех.");
        }
    }

    public static void dtrmFileExts(String[] folderContents) {
        int count = 1;
        for (String fileName : folderContents) {
            File file = new File(fileName);
            if (file.isFile()) {
                String extension = getExt(fileName);
                System.out.printf("%d Расширение файла: %s%n", count++, extension);
            }
        }
    }

    public static String getExt(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex == -1) {
            return "";
        } else {
            return fileName.substring(dotIndex + 1);
        }
    }

    public static void wrtExcptToLogFile(Exception e, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(e.toString());
            writer.write(System.lineSeparator());
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                writer.write(element.toString());
                writer.write(System.lineSeparator());
            }
            System.out.println("Исключение записано в лог.");
        } catch (IOException ex) {
            System.err.println("Ошибка записи в лог: " + ex.getMessage());
        }
    }
}
