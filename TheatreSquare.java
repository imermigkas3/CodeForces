import java.util.*;
import java.io.*;

public class TheatreSquare {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        long numWidth =  Math.ceil(n / a);
        long numHeight =  Math.ceil(m / a);
        long ans = numWidth * numHeight;
        System.out.printf("%.0f", ans);


    
    }
}
