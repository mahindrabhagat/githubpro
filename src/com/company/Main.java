package com.company;

import java.util.Scanner;

class salary
{
    String name;
    String add;
    String sub;
    int phone;
    int salary;
    int tax;
    public void setdetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE TEACHER NAME:: ");
        name=sc.next();
        System.out.println("ENTER THE TEACHER ADDRESS:: ");
        add=sc.next();
        System.out.println("ENTER THE SUBJECT SPEC. TEACHER:: ");
        sub=sc.next();

        System.out.println("ENTER THE TEACHER SALARY:: ");
        salary=sc.nextInt();
    }
    public void getdisplay()
    {
        System.out.println("...........TEACHER TAX DETAILS...............");
        System.out.println("NAME OF TEACHER:: "+name);
        System.out.println("ADDRESS TEACHER:: "+add);
        System.out.println("SUBJECT SPEC. OF TEACHER:: "+sub);
    }
    public void getdetails()
    {
        if(salary>175000)
        {
            double b= (salary*(0.05));
            System.out.println("EMPLOYEE NEED TO PAY A TAX OF:: "+b);
        }
        else
        {
            System.out.println("NO NEED TO PAY TAX");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        salary employee=new salary();
        employee.setdetails();
        employee.getdisplay();
        employee.getdetails();
    }
}

