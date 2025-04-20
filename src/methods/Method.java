package methods;

public class Method {
    public static void main(String[] args) {
        boolean isValid = checkLogin("admin", "1234");

        if (isValid) {
            System.out.println("Успешный вход в систему.");
        } else {
            System.out.println("Неверный логин или пароль.");
        }
    }

    public static boolean checkLogin(String username, String password) {
        return username.equals("admin") && password.equals("1234");
    }
}
