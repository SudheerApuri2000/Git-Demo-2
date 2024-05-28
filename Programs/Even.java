public class Even {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        /*if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }*/
        // for a given range
        for(int i = a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
            else
            {
                System.out.println("Odd");
            }
        }
    }
}
