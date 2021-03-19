package generics5;

import java.util.ArrayList;

public class Task1<E> {                             
	private E[] list = (E[]) new Object[3];
	private int size = 0;
	
	//returns the number of elements in the stack
	public int getSize() {
		return size;
	}

	//returns the top element, but does not remove it from the stack
	public E peek() {
		return list[size - 1];
	}

	//adds a new element on top of the stack
	public void push(E o) {
		if( size>= list.length) {     //prowerqwame dali goleminata na masiva pozwolqwa dobawqneto na oshte elementi
			doubleList();
		}
		list[size++] = o;
	}
	
	//returns and removes the top element of the stack
	public E pop() {
		E o = list[--size];         //wajno e da e otpred
		return o;
	}
	
	//returns true if the stack is empty
	public boolean isEmpty() {
		return size ==0;
	}

	//udwoqwa capaciteta na masiva
	private void doubleList() {
		E[] tempList = (E[])new Object[list.length*2];                //casting s dwoino po-golqm razmer
		System.arraycopy(list, 0, tempList, 0, list.length);          //copirame stoinostite
		list = tempList;
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}