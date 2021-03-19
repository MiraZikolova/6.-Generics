package generics5;

public class GenericStack<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<>(); //private списък с данни от същия тип
	
	//creates an empty stack
//	public Task1() {
//	}
	
	//returns the number of elements in the stack
	public int getSize() {
		return list.size();
	}

	//returns the top element, but does not remove it from the stack
	public E peek() {
		return list.get(getSize()-1);
	}
	
	//adds a new element on top of the stack
	public void push(E o) {
		list.add(o);
	}
	
	//returns and removes the top element of the stack
	public E pop() {
		E o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	//returns true if the stack is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
	}

