package genericMethod6;

import java.util.ArrayList;

public class GenericSortImplemented {
public static void main(String[] args) {
// Create an Integer array
		Integer[] intArray = { new Integer(2), new Integer(4), new Integer(3) };
// Create a Double array
		Double[] doubleArray = { new Double(3.4), new Double(1.3), new Double(-22.1) };
// Create a Character array
		Character[] charArray = { new Character('a'), new Character('J'), new Character('r') };
// Create a String array
		String[] stringArray = { "Tom", "Susan", "Kim" };
//Sort the arrays
		sort(intArray);
		sort(doubleArray);
		sort(charArray);
		sort(stringArray);
// Display the sorted arrays
		System.out.print("Sorted Integer objects: ");
		printList(intArray);
		System.out.print("Sorted Double objects: ");
		printList(doubleArray);
		System.out.print("Sorted Character objects: ");
		printList(charArray);
		System.out.print("Sorted String objects: ");
		printList(stringArray);
	

	GeometricObject[] go = {new Circle(3), new Rectangle(1,2), new Circle(1)};
	sort(go);            //dawa greshka ako me implementira interface Comparable, zashtoto trqbwa da izpolzwa compareTo
	printList(go);
	
	}

	/** Sort an array of comparable objects */
	public static <E extends Comparable<E>> void sort(E[] list) {     //Comparable sam po sebe si e generic interface
		E currentMin;                              //sled compilation wsichki generic tipove se iztriwat ( Comparable currentMin )
		int currentMinIndex;

//SELECTION SORT (winagi nai-malkiq element se slaga nai-otpred, a sled towa se izwurshwa sushtoto deistwie, no bez da se schita weche zaetata purva poziciq
		for (int i = 0; i < list.length - 1; i++) {
// Find the minimum in the list[i+1..list.length−2]
			currentMin = list[i];
			currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}   //izwurtli li se tozi cikul wednuj, znaem, che weche sme zapulnili purwata poziciq

	/** Print an array of objects */
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i] + " ");
		System.out.println();
	}

	
	
	
	
	
	public static <E> void shuffle(ArrayList<E> list) { // ne e <E extends Comparable<E>>, zashtoto ne nujno da srawnqwame stoinosti
		for(int i = 0; i< list.size(); i++) {
			int randomIndex = (int) (Math.random() * list.size()); //0 ili 1 po razmera na masiva
			E temp = list.get(i);
			list.set(i, list.get(randomIndex));
			list.set(randomIndex, temp);
			
		}
	}
	
	
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
	E currentMin;                            
	int currentMinIndex;

	for (int i = 0; i < list.size() - 1; i++) {

		currentMin = list.get(i);
		currentMinIndex = i;
		for (int j = i + 1; j < list.size(); j++) {
			if (currentMin.compareTo(list.get(j)) > 0) {
				currentMin = list.get(j);
				currentMinIndex = j;
			}
		}

//Swap list[i] with list[currentMinIndex] if necessary;
		if (currentMinIndex != i) {
			list.set(currentMinIndex, list.get(i));
			list.set(i, currentMin);
		}
	}
	}
	
	
	
	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		E currentMin = list.get(0);                            

		for (int i = 0; i < list.size() - 1; i++) {
			
				if (currentMin.compareTo(list.get(i)) > 0) {
					currentMin = list.get(i);

				}
			}

				return currentMin;
			}
		
	}
	

	