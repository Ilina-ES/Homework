package javaoop.homework1;

public class Parents extends Grandparents{
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String mother(){
        firstName = "Екатерина";
        secondName = "Ильина";
        age = 33;
        status = "Мама";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }

    public String father(){
        firstName = "Иван";
        secondName = "Ильин";
        age = 38;
        status = "Папа";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
}
