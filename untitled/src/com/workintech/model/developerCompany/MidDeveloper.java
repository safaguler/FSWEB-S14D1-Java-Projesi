package com.workintech.model.developerCompany;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void work() {
        setSalary(2250);
        System.out.println("Mid Developer starts to working");
    }
}
