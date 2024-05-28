public class Xylem {
    public static void main(String[] args) {
        int a = 12348;
        int fd = 0,ld=0;
        int sum = 0;
        int t =a,c=0;
        ld = a%10;
        a/=10;
        while(a>9)
        {
            int r = a%10;
            sum+=r;//sum = sum +r;
            a/=10;
        }
        fd = a;
        if(fd+ld==sum)
        {
            System.out.println("Xylem");
        }
        else
        {
            System.out.println("Pholem");
        }
        
    }
}
