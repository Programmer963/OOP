import java.time.LocalDate;

public class BackendProgrammer extends Programmer {
    public BackendProgrammer(String name, int experience) {
        super(name, "Java", experience, LocalDate.of(1998, 2, 15));
    }

    @Override
    public void code() {
        System.out.println(getName() + " пишет серверный код на Java.");
    }

    @Override
    void work() {
        System.out.println("Работает Backend разработчиком.");
    }
}