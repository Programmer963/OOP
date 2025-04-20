package classes;

import java.time.LocalDate;

public class FrontendProgrammer extends Programmer {
    public FrontendProgrammer(String name, int experience) {
        super(name, "JavaScript", experience, LocalDate.of(1998, 2, 15));
    }

    @Override
    void work() {
        System.out.println("Работает Frontend азработчиком.");
    }

    @Override
    public void code() {
        System.out.println(getName() + " верстает интерфейсы на JavaScript.");
    }

}
