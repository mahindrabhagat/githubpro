package com.company;

import java.util.Scanner;

class Stud
{
    String name;
    int age;
    int m1;
    int m2;
    int m3;
    int max;
    int avg;
    public void mahi()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NAME:: ");
        name=sc.next();
        System.out.println("ENTER THE MATH MARKS:: ");
        m1=sc.nextInt();
        System.out.println("ENTER THE SCIENCE MARKS:: ");
        m2=sc.nextInt();
        System.out.println("ENTER THE ENGLISH MARKS:: ");
        m3=sc.nextInt();
    }
    public void setvg()
    {
        avg=((m1+m2+m3)/3);

    }
    public int getvg()
    {
        return avg;
    }
    public void getisplay()
    {
        System.out.println("........STUDENT DISPLAY INFORMATION........");
        System.out.print("Student ::  ");
        System.out.println(name);
        System.out.println("Marks in math:: "+m1);
        System.out.println("Marks in science:: "+m2);
        System.out.println("Marks in english:: "+m3);
        System.out.println("Average marks :: "+avg);
    }

}
public class ASSIGNMENT2 {
    public static void main(String[] args) {
        Stud student=new Stud();
        student.mahi();
        student.setvg();
        student.getvg();
        student.getisplay();
        System.out.println("This is mahindra bhagat coding");
    }
}