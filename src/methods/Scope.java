package methods;

public class Scope {
    static String globalMessage = "Я глобальная переменная!";

    public static void main(String[] args) {
        String localMessage = "Я локальная переменная в main()";

        System.out.println(globalMessage);  // доступна везде
        System.out.println(localMessage);   // доступна только в main()

        if (true) {
            String blockMessage = "Я переменная из блока if";
            System.out.println(blockMessage);
        }

        // System.out.println(blockMessage); // Ошибка! Вне блока if
    }

    public static void showMessage() {
        String localMessage = "Я локальная переменная в showMessage()";
        System.out.println(globalMessage);  // можно использовать
        System.out.println(localMessage);   // работает тут, но не в main
    }
}
