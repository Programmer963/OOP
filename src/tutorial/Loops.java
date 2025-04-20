package tutorial;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("while: ");
        int n = 0;
        while (n < 3) {
            System.out.println("Загрузка " + (n + 1));
            n++;
        }
        System.out.println("Загрузка закончена!");


        System.out.println("\ndo while: ");
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "admin123";
        String inputPassword;

        do {
            System.out.print("Введите пароль: ");
            inputPassword = scanner.nextLine();
            if (!inputPassword.equals(correctPassword)) {
                System.out.println("Неверный пароль. Попробуйте снова.");
            }
        } while (!inputPassword.equals(correctPassword));

        System.out.println("Доступ разрешён. Добро пожаловать!");
        scanner.close();

        System.out.println("\nfor: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Создан пользователь с ID: USER" + i);
        }


        String[] days = {"Пн", "Вт", "Ср"};
        String[] hours = {"10:00", "12:00", "14:00"};
        for (String day : days) {
            System.out.println("День: " + day);
            for (String hour : hours) {
                System.out.println("  Время: " + hour);
            }
        }


        String[] users = {"Alex", "BANNED_Maria", "Bogdan", "BANNED_Eva", "Admin"};
        for (String user : users) {
            System.out.println("Отправлено письмо пользователю: " + user);
        }

        for (String user : users) {
            System.out.println("Проверка пользователя: " + user);
            if (user.equals("Admin")) {
                System.out.println("Найден администратор. Останавливаем поиск.");
                break;
            }
        }
        for (String user : users) {
            if (user.startsWith("BANNED_")) {
                System.out.println("Пропускаем заблокированного пользователя: " + user);
                continue;
            }
            System.out.println("Отправка уведомления: " + user);
        }

        System.out.println("\n");
        int[][] grades = {
                {85, 90, 78},
                {76, 88, 95},
                {92, 91, 89}
        };

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Оценки студента №" + (i + 1) + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println("  Предмет " + (j + 1) + ": " + grades[i][j]);
            }
        }
    }
}
