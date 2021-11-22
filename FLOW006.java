import java.util.*;

public class FLOW006 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        for (i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = 0;
            int total = 0;
            while (n > 0) {
                k = n % 10;
                n = n / 10;
                total += k;
            }
            System.out.println(total);
        }
        sc.close();
    }
}
