package src;

import java.util.Scanner;

class Student
{
    String name;
    int m1;
    int m2;
    int m3;
    int m4;
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
        System.out.println("ENTER THE COMPUTER MARKS:: ");
        m4=sc.nextInt();
    }
    public void setAvg()
    {
        avg=((m1+m2+m3+m4)/4);
    }
    public int getAvg()
    {
        return avg;
    }

    public void getdisplay()
    {
        System.out.println("........STUDENT DISPLAY INFORMATION........");
        System.out.print("Student ::  ");
        System.out.println(name);
        System.out.println("Marks in math:: "+m1);
        System.out.println("Marks in science:: "+m2);
        System.out.println("Marks in english:: "+m3);
        System.out.println("Marks in computer:: "+m4);
        System.out.println("Average marks :: "+avg);
    }
    public void setGrade()
    {
        if(avg>90)
        {
            System.out.println("GRADE OBTAINED:: A++");
        }
        else
        {
            System.out.println("GRADE OBTAINED:: A");
        }
    }
}
public class newassign {
    public static void main(String[] args) {
        Student student=new Student();
        student.mahi();
        student.setAvg();
        student.getAvg();
        student.getdisplay();
        student.setGrade();
        System.out.println("This is mahindra bhagat coding");
    }
}


