
import java.util.*;
import java.io.*;


public class NextRound {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();
       int k = sc.nextInt();
       int[] scores = new int[n];
       int minScore = 0;
       int score = 0;
       for (int i = 0; i < n; i++) {
            score = sc.nextInt();
            scores[i] = score;
            if (i == k - 1) 
                minScore = score;
       }

       int count = 0;
       for (int s: scores) {
            if (s >= minScore && s > 0) count++;
       }
       System.out.println(count);
       sc.close();
    }
    
    
}
