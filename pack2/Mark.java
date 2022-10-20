package pack3;

import java.util.Scanner;

public class Mark {
	
	
	public static void main(String[] args) {
		Mark obj=new Mark();
		obj.gradeCalculation();
	}
	
	
	
	
	
	
	
	
	
	
	public void gradeCalculation() {
		Scanner sca=new Scanner(System.in);
		
		System.out.println("ENTER MARKS OF TAMIL = ");
		int tam=sca.nextInt();
		
		System.out.println("ENTER MARKS OF ENGLISH = ");
		int eng=sca.nextInt();
		
		System.out.println("ENTER MARKS OF MATHS = ");
		int maths=sca.nextInt();
		
		System.out.println("ENTER MARKS OF BIOLOGY = ");
		int bio=sca.nextInt();
		
		System.out.println("ENTER MARKS OF PHYSICS = ");
		int phy=sca.nextInt();
		
		System.out.println("ENTER MARKS OF CHEMISTRY = ");
		int chem=sca.nextInt();
		
		int total=tam+eng+maths+bio+phy+chem;
		
		int avg=total/6;
		
		if (avg>=80) {
			System.out.println("Your grade is A and your total is = "+total);
		} else if(avg<=80 && avg>=60){
			System.out.println("Your grade is B and your total is = "+total);
		} else if(avg<=60 && avg>=40) {
			System.out.println("Your grade is C and your total is = "+total);
		} else {
			System.out.println("DO SMART WORK and your total is = "+total);
		}
		sca.close();
	}
}
