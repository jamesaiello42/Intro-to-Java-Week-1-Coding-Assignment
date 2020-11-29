package javaWeek1;

public class App {
	public static void main(String[] args) {
		/* These variables represent the following from the Java Week 1 Coding requirements in the same order:
		 * 	Item price
		 *  Amount of money in wallet
		 *  Number of friends
		 *  Age in years (as a whole number)
		 *  First name
		 *  Last name
		 *  Middle initial
		*/
		double itemPrice = 90.25;
		double moneyInWallet = 100.25;
		int numberOfFriends = 10;
		int age = 24;
		String firstName = "James";
		String lastName = "Aiello";
		char middleInitial = 'L';
		
		/* These variables represent the following from the Java Week 1 Coding requirements where operations were performed:
		 * 	New amount of money in wallet after buying the item
			Number of friends you’ve made each year based on your age variable and your number of friends variable
			Full name based on first name, middle initial, and last name
		*/
		double moneyLeftInWallet = moneyInWallet - itemPrice;
		int annualFriends = numberOfFriends * age;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		// Printing out every in the program, one println for each variable.
		System.out.println("Price per item is $" + itemPrice + ".");
		System.out.println("Total amount of money in my wallet before purchasing the item is $"  + moneyInWallet + ".");
		System.out.println("Number of friends I have is " + numberOfFriends + ".");
		System.out.println("I am " + age + " years old.");
		System.out.println("My first name is " + firstName + ".");
		System.out.println("My last name is " + lastName + ".");
		System.out.println("My middle initial is " + middleInitial + ".");
		System.out.println("The amount left in my wallet after purchasing one item is $" + 
							String.format("%.2f", moneyLeftInWallet) + "."); // Needed a format function. Source: https://stackoverflow.com/questions/12806278/double-decimal-formatting-in-java 
		System.out.println("If I made the same number of friends for every year of my age, then that number would be " + annualFriends + " friends.");
		System.out.println("My full name is " + fullName + ".");
		
	}
}
