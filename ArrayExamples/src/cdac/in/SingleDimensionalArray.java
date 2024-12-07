package cdac.in;

public class SingleDimensionalArray {
	int arr[] = null;
	public	SingleDimensionalArray(int sizeOfArray) {
		arr=new int[sizeOfArray];         // O(1)
		for(int i=0;i<arr.length;i++) {   // time complexity O(n),space complexity O(n)
			arr[i]=Integer.MIN_VALUE;     // O(1)
		}
	}
	//! visiting all the data of an array
	public void displayData(){
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+" ");
			}
		} catch (Exception e) {
			System.out.println("Array does not exist ");
		}
	}
	
	public void insertData(int location,int value) {
		try{
			if(arr[location]==Integer.MIN_VALUE) {
				arr[location]=value;
				System.out.println("Value  inserted Successfully");
			}
			else{
				System.out.println("The cell is already contains some value");
				System.out.println("Insertion failed");
			}
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index value is out of range of an existing array");
		}
	}
	
	public void searchData(int value){
		for(int i=0;i<arr.length;i++) {
			if (value==arr[i]) {
				System.out.println("index of value "+value + " is "+i);
				return;
			}
		}
		System.out.println("value "+value+ " is not available in array");
	} 
	//! Delete using index
	public void deleteData(int indexValue){
		try {
			arr[indexValue]=Integer.MIN_VALUE;
			System.out.println("value deleted");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index value is out of range");
		}
	}
	//! Delete using value
	public void deleteValue(int value){
		for(int i=0;i<arr.length;i++) {
			if (value==arr[i]) {
				arr[i]=Integer.MIN_VALUE;
				return;
			}
		}
		System.out.println("value "+value+ " is not available in array");
	} 
}