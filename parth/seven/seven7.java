public class seven7 {
    public static void main(String[] args) {
		
			Integer[] intArray = {12, 13, 10, 4};
			// Create a Double array
			Double[] doubleArray = {12.21, 23.34, 43.94, 32.09};
			// Create a Character array
			Character[] charArray = {'a', 'f', 'z', 'c'};
			// Create a String array
			String[] stringArray = {"Tom", "Susan", "Kim"};
			System.out.print("Original Integer objects: "); printList(intArray);
			System.out.print("Original Double objects: "); printList(doubleArray); 
			System.out.print("Original Character objects: "); printList(charArray);
			System.out.print("Original String objects: "); printList(stringArray);
			// Sort the arrays
			sort(intArray);
			sort(doubleArray);
			sort(charArray);
			sort(stringArray);
			// Display the sorted arrays
			System.out.print("Sorted Integer objects: "); printList(intArray);
			System.out.print("Sorted Double objects: "); printList(doubleArray); 
			System.out.print("Sorted Character objects: "); printList(charArray);
			System.out.print("Sorted String objects: "); printList(stringArray);
	}

	/** Sort an array of comparable objects */
	public static <E extends Comparable<E>> void sort(E[] list) { 
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.length - 1; i++) {
			currentMin = list[i];
			currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) { 
				if (currentMin.compareTo(list[j]) > 0) {
					if (currentMinIndex != i) { 
						list[currentMinIndex] = list[i]; 
						list[i] = currentMin;
					}
				}
			}
		}
	}
	public static void printList(Object[] list) { 
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
}

