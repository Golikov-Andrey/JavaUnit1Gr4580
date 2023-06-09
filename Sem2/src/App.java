import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
       //Task1.execute();  

    //    String input = "aaaaabbbaaabbbbbbb";
    //    if(input.isEmpty())
    //    {

    //    }
    //    else{
    //     String compressed1 = Task2.compressString(input);
    //     System.out.println(compressed1);
    //     String compressed2 = Task2.compress(input);
    //     System.out.println(compressed2);
    //    }

        //Task4.writeTestToFile(100);

        
        //  String buferLine = Task4.createString();
        // try{
        //      Task4.writer(buferLine);
        // }
        // catch(IOException e)
        // {}

        // String str = Task4.createString(100);
        // Task4.writeToFile("file.txt", str);


        try {
            String[] fldrCnt = Task5.getCrntFldrCnts();
            Task5.wrtArrToFile(fldrCnt, "filenames.txt");
            Task5.dtrmFileExts(fldrCnt);
        } catch (IOException e) {
            Task5.wrtExcptToLogFile(e, "log.txt");
        }

        //use db.main select * from student where name='Ivanov' and country='Russia'
    }
}
