import java.util.*;

public class Asce {
    public static void main(String[] args) {
        int a[] = {55, 12, 18, 36, 91, 5};
        int n = a.length;
        
        // Sorting the array
        Arrays.sort(a);
        
        // First half ascending and second half descending order
        for(int i = 0; i < n / 2; i++) {
            System.out.print(a[i] + " ");
        }
        for(int i = n-1;i>=n/2;i--)
        {
             System.out.print(a[i] + " ");
        }
        

    }
}