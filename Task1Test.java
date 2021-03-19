package generics5;

import java.util.Scanner;

public class Task1Test {
	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("String " + (i + 1) +": ");
			stack1.push(sc.nextLine());
		}
		sc.close();
		for(int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());     //lifo
		}
	}
	
}