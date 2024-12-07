package cdac.in;

public class UniqueArray {
	int arr[]={20,10,30,50,40,60};
	public void uniqueNumber(){
		boolean isUnique = true;
		for (int i = 0; i < arr.length-1; i++) {
			//! avoids checking the same pair of elements multiple times.
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isUnique = false;
					break; 
				}
			} 
		}
		if (isUnique) {
			System.out.println("Array is unique");
		} else {
			System.out.println("Array is not unique");
		}
	}
	public static void main(String[] args) {
		UniqueArray ua=new UniqueArray();
		ua.uniqueNumber();
	}
}
