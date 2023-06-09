public class Task1 {
    public static void execute()
    {
        // int N = 15;
        // char c1 = 'a';
        // char c2 = 'b';
        // StringBuilder result = new StringBuilder();
        // for (int i = 0; i < N/2; i++) {
        //     result.append(c1);
        //     result.append(c2);
        //     // if (i%2==0){
        //     //     result.append(c1);
        //     // }
        //     // if (i%2!=0){
        //     //     result.append(c2);
        //     // }
        // }
        // if(N%2!=0)
        // {
        //     result.append(c1);
        // }
        // System.out.println(result.toString());


        int n = 15;
        char c1 = 'a';
        char c2 = 'b';
        StringBuilder result = new StringBuilder();
        result.append(c1);
        for (int i = 1; i < n - 1; i++) {
            if (result.charAt(i - 1) == c1) result.append(c2);
            else result.append(c1);
        }
        System.out.println(result);
    }
}
