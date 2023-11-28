package com.workintech.model.developerCompany;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void work() {
        setSalary(4000);
        System.out.println("Senior Developer starts to working");
    }
}
