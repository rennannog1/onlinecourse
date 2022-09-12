package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set <Student>set = new HashSet<>();
		System.out.println("How many students for course A: ");
		Integer n = sc.nextInt();
		for (int i=0;i<n;i++) {
			Integer code = sc.nextInt();
			set.add(new Student (code));
		}
		System.out.println("How many students for course B: ");
		n = sc.nextInt();
		for (int i=0;i<n;i++) {
			Integer code = sc.nextInt();
			set.add(new Student (code));
		}
		System.out.println("How many students for course C: ");
		n = sc.nextInt();
		for (int i=0;i<n;i++) {
			Integer code = sc.nextInt();
			set.add(new Student (code));
		}
		
			
				System.out.println("Total students: " + set.size());
			}
	}


