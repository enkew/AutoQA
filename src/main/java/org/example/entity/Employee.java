package org.example.entity;

public class Employee {
    private String FIO;
    private String jobTitle;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String FIO, String jobTitle, String email, String number, int salary, int age) {
        this.FIO = FIO;
        this.jobTitle = jobTitle;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("""
                ФИО: %s
                Адрес: %s
                Email: %s
                Номер телефона: %s
                Зарплата: %s
                Возраст: %s
                """, FIO, jobTitle, email, number, salary, age);
    }
}
