public class Swaparr {
    public static void main(String[] args) {
        int a[]={5,8,7,9,12,6,7};
        for(int i = 0;i<a.length-1;i=i+2)
        {
           a[i]=a[i]+a[i+1]-(a[i+1]=a[i]);
        }
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
