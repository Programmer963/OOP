package classes;

import java.time.LocalDate;
import java.time.Period;

abstract class Programmer {
    private String name;
    private String language;
    private int experience;
    LocalDate birthDate;

    void printAge() {
        Period age = Period.between(birthDate, LocalDate.now());
        System.out.println(name + " — " + age.getYears() + " лет");
    }

    abstract void work();

    public Programmer(String name, String language, int experience, LocalDate birthDate) {
        this.name = name;
        this.language = language;
        this.experience = experience;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public int getExperience() {
        return experience;
    }

    public void code() {
        System.out.println(name + " пишет код на " + language + ".");
    }

}
