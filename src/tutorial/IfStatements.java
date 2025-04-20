package tutorial;

public class IfStatements {
    public static void main(String[] args) {
        String role = "admin";

        if (role.equals("admin")) {
            System.out.println("У вас есть доступ к панели управления.");
        } else {
            System.out.println("У вас обычный доступ.");
        }


        int x = 41;
        int y = 64;
        System.out.println("\nTernary Operator: ");
        int z = x < y ? y - x : x - y;
        System.out.println(z);
    }
}
