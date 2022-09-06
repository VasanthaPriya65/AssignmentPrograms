package sessionQuestions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		System.out.println("Enter the Range :");
		int a,b;
		a=num+1;
		b=num^1;
		sc.close();

		if(a==b) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}

	}}

