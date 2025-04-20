package classes;

class JavaDeveloper implements Developer {
    @Override
    public void code() {
        System.out.println("Пишет код на Java.");
    }

    @Override
    public void debug() {
        System.out.println("Ищет баги в Java-коде.");
    }
}
