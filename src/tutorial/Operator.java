package tutorial;

public class Operator {
    public static void main(String[] args) {
        int a = 100;
        int b = 13;

        System.out.println("Arithmetic Operators: ");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println("a++ = " + a++);
        System.out.println("++a = " + ++a);
        System.out.println("a-- = " + a--);
        System.out.println("--a = " + --a);

        System.out.println("\nAssignment Operators: ");
        a = b;
        int c = 3;
        System.out.println("a = " + a);
        System.out.println("a+=c " + (a+=c));
        System.out.println("a-=c " + (a-=c));
        System.out.println("a*=c " + (a*=c));
        System.out.println("a/=c " + (a/=c));
        System.out.println("a%=c " + (a%=c));
        a = 100;
        System.out.println("a&=c " + (a&=c));
        a = 100;
        System.out.println("a|=c " + (a|=c));
        a = 100;
        System.out.println("a^=c " + (a^=c));
        a = 100;
        System.out.println("a>>=c " + (a>>=c));
        a = 100;
        System.out.println("a<<=c " + (a<<=c));

        int x = 10;
        int y = 21;
        int z = 31;
        System.out.println("\nComparison Operators: ");
        System.out.println("x == y: " + (x == y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        System.out.println("\nLogical Operators: ");
        System.out.println("x > y && x < y: " + (x > y && x < y));
        System.out.println("x > y || x < y: " + (x > y || x < y));
        System.out.println("x > y && x < y: " + !(x > y && x < y));
    }
}
