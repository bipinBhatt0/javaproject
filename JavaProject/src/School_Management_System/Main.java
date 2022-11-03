/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School_Management_System;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bipin
 */
public class Main {
     public static void main(String[] args) {
        Teacher Michele = new Teacher(1,"Michele Johnson",500);
        Teacher Harry = new Teacher(2,"Harry Jones",700);
        Teacher cory = new Teacher(3,"Cory",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Michele);
        teacherList.add(Harry);
        teacherList.add(cory);


        Student john = new Student(1,"John",4);
        Student mike = new Student(2,"Mike",12);
        Student richard = new Student(3,"Richard",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(john);
        studentList.add(richard);
        studentList.add(mike);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        john.payFees(5000);
        mike.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Michele.receiveSalary(Michele.getSalary());
        System.out.println("GHS has spent for salary to " + Michele.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        cory.receiveSalary(cory.getSalary());
        System.out.println("GHS has spent for salary to " + cory.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(richard);

        Harry.receiveSalary(Harry.getSalary());

        System.out.println(Harry);


    }
}
