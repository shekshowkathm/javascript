package pack2;

import java.util.Scanner;

public class Palindrome {
	Scanner sca=new Scanner(System.in);
	String name;
	
	public static void main(String[] args) {
		
		
		Palindrome obj = new Palindrome();
		obj.for_loop_method();
		obj.without_library_method();
		obj.with_library_method();
		obj.palindromeNumber();
		
		
		

	}
	
	public void without_library_method() {
		
		
		System.out.println("ENTER A WORD : ");
		
		name=sca.nextLine();
		
		
		StringBuffer newStr= new StringBuffer();
		
		for(int i=name.length()-1; i>=0; i--) {
			newStr=newStr.append(name.charAt(i));
		}
		
		if (name.equalsIgnoreCase(newStr.toString())) {
			System.out.println("GIVEN WORD IS PALINDROME");
		} else {
			System.out.println("GIVEN WORD IS NOT PALINDROME");
		}
	}
	
	public void with_library_method() {
		System.out.println("ENTER A WORD : ");
		
		name =sca.nextLine();
		
		String reverse = new StringBuffer(name).reverse().toString();
		
		if (name.equals(reverse)) {
			System.out.println("GIVEN WORD IS PALINDROME");
		} else {
			System.out.println("GIVEN WORD IS NOT PALINDROME");
		}
		
	}
	
	public void palindromeNumber() {
		System.out.println("ENTER A NUMBER : ");
		
		int num=sca.nextInt();
		
		int org_num=num;
		
		int rev=0;
		
		while (num!=0) {
			rev=rev*10 + num%10;
			
			num=num/10;
		}
		System.out.println("the reversed number : "+ rev);
		
		if (org_num==rev) {
			System.out.println("GIVEN NUMBER IS PALINDROME");
		} else {
			System.out.println("GIVEN NUMBER IS NOT PALINDROME");
		}
	}
	
	public void for_loop_method() {
		System.out.println("ENTER A WORD : ");
		
		String names =sca.nextLine();
		String empNames="";
		
		for(int i=names.length()-1; i>=0; i--) {
			System.out.println("the reversed number : "+names.charAt(i));
			empNames=empNames+ names.charAt(i);
		}
		
		if (names.equals(empNames)) {
			System.out.println("GIVEN WORD IS PALINDROME");
		} else {
			System.out.println("GIVEN WORD IS NOT PALINDROME");
		}
	}
		
	
}
