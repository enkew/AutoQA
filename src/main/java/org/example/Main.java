package org.example;

import org.example.entity.Employee;
import org.example.entity.Park;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Костецкий Григорий Игоревич", "QA", "testqa@gmail.com", "375293593310", 1000, 28);
        employees[1] = new Employee("Леоненко Алексей Леонидович", "Back", "testback@gmail.com", "375291336625", 2000, 23);
        employees[2] = new Employee("Валько Алексей Игоревич", "Front", "testfront@gmail.com", "375441584525", 1700, 24);
        employees[3] = new Employee("Главдель Ольга Сергеевна", "BA", "testba@gmail.com", "375332356647", 1500, 28);
        employees[4] = new Employee("Алисиевич Сергей Викторович", "QA", "qalead@gmail.com", "375293532655", 2000, 30);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        Park.Attraction attraction = new Park().new Attraction("Весёлые горки", "С 8:00 до 17:00", 300);
        System.out.println(attraction);
    }
}