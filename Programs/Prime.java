import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt(),b=sc.nextInt();
         /*
         To check whether the given no. is prime or not 
         for(int i = 2;i<a;i++)
        {
            if(a%i==0)
            {
                fc++;
            }
        }
        if(fc==0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Composite");
        }

        // To print numbers

        for(int i = 1;i<=a;i++)
        {
            int fc = 0;
            for(int j = 1;j<=i;j++)
            {
                if(i%j==0)
                {
                    fc++;
                }
            }
            if(fc==2)
            {
                System.out.println(i);
            }
        }*/

        // Given Range

        for(int i = a;i<=b;i++)
        {
            int fc = 0;
            for(int j = 1;j<=i;j++)
            {
                if(i%j==0)
                {
                    fc++;
                }
            }
            if(fc==2)
            {
                System.out.println(i);
            }
        }
    }
    
}
