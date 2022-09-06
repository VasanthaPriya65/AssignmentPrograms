package sessionQuestions;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter value of n1:");
	    int n1=sc.nextInt();
	    System.out.println("Enter value of n2:");
	    int n2=sc.nextInt();
	    n1=n1^n2;
	    n2=n1^n2;
	    n1=n1^n2;
	    sc.close();
	    System.out.println("Swapped Value of n1,n2 " + n1 +" and "+n2);

	}

}
