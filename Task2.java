package generics5;

import java.util.ArrayList;

//generic stack shte bude array lista
public class Task2<E> extends ArrayList<E>{                               //directno shte se obrushtame kum metodite kato nashi




	//returns the top element, but does not remove it from the stack
		public E peek() {
			return get(size()-1);          //size e metod, koito po princip prinadleji na ArrayList i ne e nujno da go predefinirame
		}
		
	//adds a new element on top of the stack
		public void push(E o) {
			add(o);                    //sam proverqwa ds
		}
		
	//returns and removes the top element of the stack
		public E pop() {
			E o = get(size()-1);
			remove(size()-1);
			return o;                    //wrushtame referenciq
		}
		

	@Override
		public String toString() {
			return "stack: " + super.toString();
		}
		}

