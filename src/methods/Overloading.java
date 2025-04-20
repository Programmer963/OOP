package methods;


public class Overloading {
    public static void main(String[] args) {
        sendNotification();
        sendNotification("Мария");
        sendNotification("Аружан", "Пора проверить отчёты!");
    }

    // 1. Без параметров
    public static void sendNotification() {
        System.out.println("Уведомление: У вас есть новое сообщение.");
    }

    // 2. С одним параметром
    public static void sendNotification(String name) {
        System.out.println("Привет, " + name + "! У вас новое сообщение.");
    }

    // 3. С двумя параметрами
    public static void sendNotification(String name, String message) {
        System.out.println(name + ", сообщение: " + message);
    }
}
