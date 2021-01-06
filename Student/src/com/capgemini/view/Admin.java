package com.capgemini.view;
import com.capgemini.service.StudentSchedular;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentSchedular sch = new StudentSchedular();
		while(true)
		{
			System.out.println("MENU:");
			System.out.println("1.Insert Student Record\n2.Show all Records\n3.Search a Record by "
					+ "Roll NO\n4.Show Students Details By Course Name\n5.Show Count By Course\n"
					+ "6.Exit\nENTER YOUR CHOICE");
			int choice= sc.nextInt();
			switch (choice)
			{
			case 1:
				sch.addStudent();
				break;
			case 2:
				sch.showAllStudent();
				break;
			case 3:
				sch.showByRollNumer();
				break;
			case 4:
				sch.showByCourse();
				break;
			case 5:
				sch.countByCourse();
				break;	
			case 6:
				System.exit(0);
			default:
				System.out.println("Please Enter Valid Choice!");
			}
		}
	}

	private static void showAllStudents() {
		studSch.showAllStudents();
		
	}

	private static void addStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("enter courses");
		String courses=sc.next();
		
		System.out.println(studSch.addStudent(rollNumber, name, courses));
		
	}

}
