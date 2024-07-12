package intruduction_to_oops;

public class BookRunner {

	public static void main(String[] args) {

		// Creating new class Book
		// Creating three instances of Book class

		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(45);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		// increasing no of books
		artOfComputerProgramming.increaseNoOfCopies(200);
		effectiveJava.increaseNoOfCopies(100);
		cleanCode.increaseNoOfCopies(500);
		System.out.println("Increased no of copies of book are:");
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		// decreasing no of books
		artOfComputerProgramming.decreaseNoOfCopies(200);
		effectiveJava.decreaseNoOfCopies(100);
		cleanCode.decreaseNoOfCopies(500);
		System.out.println("Decreased no of copies of book are:");
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		// artOfComputerProgramming.setNoOfCopies(100);
		// effectiveJava.setNoOfCopies(50);
		// cleanCode.setNoOfCopies(45);

	}

}
