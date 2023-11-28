package com.workintech.model.developerCompany;

import java.util.Arrays;

public class HRManager extends Employee{

    JuniorDeveloper[] juniorDevs = new JuniorDeveloper[3];
    MidDeveloper[] midDevs = new MidDeveloper[3];
    SeniorDeveloper[] seniorDevs = new SeniorDeveloper[3];


    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(3000);
        System.out.println("HRManager starts to working");
    }
    public void addEmployee(JuniorDeveloper juniorDev){
        for (int i = 0; 1 < juniorDevs.length; i++){
            if (juniorDevs[i] == null){
                juniorDevs[i] = juniorDev;
                break;
            } else if (i == juniorDevs.length-1) {
                System.out.println("Junior Developers kadrosu dolu");
            }
        }
    }
    public void addEmployee(MidDeveloper midDev){
        for (int i = 0; 1 < midDevs.length; i++){
            if (midDevs[i] == null){
                midDevs[i] = midDev;
                break;
            } else if (i == midDevs.length-1) {
                System.out.println("Mid Developers kadrosu dolu");
            }
        }
    }
    public void addEmployee(SeniorDeveloper seniorDev){
        for (int i = 0; 1 < seniorDevs.length; i++){
            if (seniorDevs[i] == null){
                seniorDevs[i] = seniorDev;
                break;
            } else if (i == seniorDevs.length-1) {
                System.out.println("Senior Developers kadrosu dolu");
            }
        }
    }

    @Override
    public String toString() {
        return "com.workintech.model.developerCompany.HRManager{" +
                "juniorDevs=" + Arrays.toString(juniorDevs) +
                ", midDevs=" + Arrays.toString(midDevs) +
                ", seniorDevs=" + Arrays.toString(seniorDevs) +
                '}';
    }
}
