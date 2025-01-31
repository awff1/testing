package itis.ru;

public class Person {
    public String lastName;
    public String firstName;
    public String middleName;

    public Gender gender;
    public Color color;

    public Person(String lastName, String firstName, String middleName, Gender gender, Color color) {
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.gender = gender;
        this.color = color;
    }

    public String toString() {
       return lastName + " " + firstName + " " + middleName + " " + gender + " " + color.rusName;
    }
}
