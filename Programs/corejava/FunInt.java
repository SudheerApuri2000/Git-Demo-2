package corejava;

@FunctionalInterface
interface a
{
    void show();
}

public class FunInt {
    public static void main(String[] args) {
        a obj = new a()
        {
            public void show()
            {
                System.out.println("Functional Interface");
            }
        };
        obj.show();
    }
}
