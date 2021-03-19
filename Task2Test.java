package generics5;

import java.util.Scanner;

public class Task2Test {
//	int a= 5;
//	static int b = 6;
	public static void main(String[] args) {
		//b = 7;
		//create a stack
		GenericStack<String> stack1 = new GenericStack<>();
		Scanner sc = new Scanner(System.in);
		
		//tell the user to enter the strings
		for(int i = 0; i < 5; i++) {
			System.out.println("String " + (i + 1) +": ");
			stack1.push(sc.nextLine());
		}
		sc.close();
		
		//display in reverse
		while (!stack1.isEmpty())                 //isEmoty ne trqbwa da bude predefiniran, zashto towa e klas naslednik na ArrayList
			System.out.println(stack1.pop());     //lifo
		}
	}
	

