package javaoop.homework1;

public class Grandparents {
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String grandMother(){
        firstName = "Галина";
        secondName = "Афанасьевна";
        age = 56;
        status = "Бабушка";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
    public String grandFather(){
        firstName = "Алексей";
        secondName = "Ильин";
        age = 60;
        status = "Дедушка";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
}
