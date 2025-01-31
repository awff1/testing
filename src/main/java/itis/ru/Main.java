package itis.ru;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Neekas",
                "Kola", "Dod",
                Gender.Male,
                Color.Black);
        System.out.println(person);
    }
}
