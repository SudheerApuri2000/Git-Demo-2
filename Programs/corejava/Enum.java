package corejava;
enum Level{
    high,medium,low;
}
 public class Enum {
    public static void main(String[] args) {
        Level l[] = Level.values();
        for (Level s : l) {
            System.out.println(s);
        }
    }
}
