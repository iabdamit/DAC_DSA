package cdac.in;

public class Person {
	public String firstName;
	public String lastName;
	public int age;

	public Person[] personArray;
	public int nElems; // ! no of data of person

	// Constructor
	public Person(int max) {
		personArray = new Person[max]; // ! array of objects of max size
		nElems = 0;
	}

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// ! displayPerson() method
	public void displayPerson() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
	}

	// ! getLast() method to return the lastName
	public String getLastName() {
		return firstName;
	}

	// ! insert person details into the array
	public void insert(String firstName, String lastName, int age) {
		try {
			personArray[nElems] = new Person(firstName, lastName, age);
			nElems++; // ! increase the size
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Size is full, so no any other data will be stored");
		}
	}

	// ! display the array person details
	public void display() {
		for (int i = 0; i < nElems; i++) {
			personArray[i].displayPerson();
			System.out.println();
		}
	}

	public void insertionSort() {
		int in, out;
		for (out = 1; out < nElems; out++) {
			Person temp = personArray[out];
			in = out;
			while (in > 0 && personArray[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
				personArray[in] = personArray[in - 1];
				in--; // * go left on position
			}
			personArray[in] = temp;
		}
	}

}