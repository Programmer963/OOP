package tutorial;

public class SwitchStatements {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1: System.out.println("пн"); break;
            case 2: System.out.println("вт"); break;
            case 3: System.out.println("ср"); break;
            case 4: System.out.println("чт"); break;
            case 5: System.out.println("пт"); break;
            case 6: System.out.println("сб"); break;
            default: System.out.println("Выходной день");
        }
    }
}
