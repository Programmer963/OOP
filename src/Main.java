import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя Frontend разработчика: ");
        String name = scanner.nextLine();

        Programmer p1 = new FrontendProgrammer(name, 3);

        Programmer p2 = new BackendProgrammer("Игорь", 5);

        p1.code();
        p2.code();
        p1.work();

        p1.printAge();

        RemoteProgrammer programmer = new RemoteProgrammer();
        RemoteProgrammer.Laptop laptop = programmer.new Laptop();
        laptop.show();

        Developer dev = new JavaDeveloper();
        dev.code();
        dev.debug();

        Day today = Day.FRIDAY;

        if (today == Day.FRIDAY) {
            System.out.println("Ура! Скоро выходные!");
        }

    }
}