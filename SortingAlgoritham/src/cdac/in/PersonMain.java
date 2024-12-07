package cdac.in;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of person array:  ");
		int maxSize = scanner.nextInt();
		Person person = new Person(maxSize);
		person.insert("Pankaj", "Kumar", 38);
		person.insert("Deepshikha", "Chauhan", 25);
		person.insert("Sandesh", "Srivastava", 24);
		person.insert("Deepak", "Singh", 26);
		person.insert("Amit", "Bhandari", 25);
		person.insert("Paras", "Saini", 25);

		System.out.println();
		System.out.println("Person Details Before Sorting: ");
		person.display();

		System.out.println();
		System.out.println("Person Details After Sorting: ");
		person.insertionSort();
		person.display();

		scanner.close();
	}

}
