package corejava;
interface B 
{
    void m1(int a);
}
public class Lam {
    public static void main(String[] args) {
        //without return type
        B obj = /*(int a)*/ a-> System.out.println("Lamda Exp "+a);
        obj.m1(5);
    }
}
