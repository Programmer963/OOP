package tutorial;

public class JavaMath {
    public static void main(String[] args) {
        int a = -13;
        int b = 49;
        System.out.println("max(a, b): " + Math.max(a, b));
        System.out.println("min(a, b): " + Math.min(a, b));
        System.out.println("sqrt(b): " + Math.sqrt(b));
        System.out.println("abs(a): " + Math.abs(a));

        int max = 10;
        int min = 1;
        int rnd = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println(rnd);
    }
}
