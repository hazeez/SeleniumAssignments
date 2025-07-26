package week2.assignments;

public class Library {
	
	// addBook method
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook("Eli Baba and Forty Thieves");
		lib.issueBook();
		
	}

}
