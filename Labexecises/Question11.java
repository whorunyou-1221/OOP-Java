package Labexecises;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        String name1 = sc.nextLine();
        System.out.print("Address: ");
        String name2 = sc.nextLine();
        System.out.print("Age: ");
        String name3 = sc.nextLine();
        System.out.print("Course: ");
        String name4 = sc.nextLine();
        System.out.print("Year Level: ");
        String name5= sc.nextLine();
        System.out.print("Secondary School Graduated: ");
        String name6 = sc.nextLine();
        System.out.print("Year: ");
        String name7 = sc.nextLine();
        System.out.println(" ");
        System.out.printf("===============PERSONAL INFO============\n");
        System.out.println(" ");
        System.out.printf("%-30s:%s\n","NAME:",name);
        System.out.printf("%-30s:%s\n", "DATE OF BIRTH:",name1);
        System.out.printf("%-30s:%s\n", "ADDRESS;",name2);
        System.out.printf("%-30s:%s\n", "AGE:",name3);
        System.out.printf("%-30s:%s\n","COURSE:",name4);
        System.out.printf("%-30s:%s\n","YEAR LEVEL:",name5);
        
        System.out.println(" ");
        System.out.printf("==============EDUCATIONAL==============\n");
        System.out.println(" ");
        System.out.printf("%-30s:%s\n","NAME OF SCHOOL:",name6);
        System.out.printf("%-30s:%s\n","YEAR:",name7);
        
    }
}
