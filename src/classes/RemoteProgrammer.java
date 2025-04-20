package classes;

public class RemoteProgrammer {
    private String name = "Иван";

    // Внутренний класс
    public class Laptop {
        public void show() {
            // Имеет доступ к полям внешнего класса
            System.out.println(name + " использует ноутбук для программирования.");
        }
    }
}
