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
public class question5{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstnum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondnum = sc.nextInt();
        int sum = firstnum * secondnum;
         System.out.println(firstnum + " x " + secondnum + " = " + sum);
    }
}
