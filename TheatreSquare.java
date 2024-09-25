import java.util.*;
import java.io.*;

public class TheatreSquare {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double a = sc.nextInt();
        double numWidth =  Math.ceil(n / a);
        double numHeight =  Math.ceil(m / a);
        long ans = (long) (numWidth * numHeight);
        System.out.println(ans);
        


    
    }
}
