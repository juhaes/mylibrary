/**
 * Library user interface
 */
package mylibrary;

import java.util.ArrayList;


// Note: In order to get JOptionPane to show right:
// Set the global environment variable "J2D_D3D" to "false" inside the OS. 
// According to Sun, this setting is used to turn off the Java 2D system's use of Direct3D in Java 1.4.1_02 and later.
import javax.swing.JOptionPane;

/**
 * @author juhaes
 *
 */
public class Mylibrary {

	static Library library = new Library();

	public static void main(String[] args) {
		
		// User login
		String user = JOptionPane.showInputDialog(null, "Enter user name", "Welcome", JOptionPane.PLAIN_MESSAGE);
		if (user.equals("admin")) {
			adminMenu();
		} else {
			userMenu();
		}
		
	}

	/**
	 * Menu for admin user
	 */
	private static void adminMenu() {

		// Operations
		String menu = "1 - Add item \n" +
					  "2 - Remove item \n" +
					  "3 - List items \n" +
					  "------------------------\n" +
					  "0 - Exit \n";
		int operation = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Library Main Menu", JOptionPane.PLAIN_MESSAGE));
		while (operation != 0) {
			switch (operation) {
			case 1:
				operationAdd();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "operation 2");
				break;
			case 3:
				operationList();
				break;
			}
			operation = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Library Main Menu", JOptionPane.PLAIN_MESSAGE));
		}
	}

	/**
	 * Menu for normal user (loaner)
	 */
	private static void userMenu() {
		JOptionPane.showMessageDialog(null, "User menu not available yet ");		
	}

	/**
	 * Add library items
	 */
	private static void operationAdd() {
		String menu = "1 - Book \n" +
				  "2 - Magazine \n" +
				  "3 - Audio CD \n" +
				  "4 - Video DVD \n" +
				  "------------------------\n" +
				  "0 - Return to main menu \n";
		int operation = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Add", JOptionPane.PLAIN_MESSAGE));
		while (operation != 0) {
			String title = JOptionPane.showInputDialog("Enter the title");
			String filled = "Title: " + title + "\n";
			String isbn = JOptionPane.showInputDialog(filled + "\nEnter the ISBN number");
			String author;
			String description;
			filled += "ISBN: " + isbn + "\n";
			int publishedYear = Integer.parseInt(JOptionPane.showInputDialog(filled + "\nEnter the published year"));
			filled += "Year: " + publishedYear + "\n";
			switch (operation) {
			case 1:
				author = JOptionPane.showInputDialog(filled + "Enter the author");
				filled += "Author: " + author + "\n";
				description = JOptionPane.showInputDialog(filled + "Enter short description");
				Book book = new Book(title, isbn, publishedYear, author, description);
				library.addItem(book);
				JOptionPane.showMessageDialog(null, "Book \"" + book.getTitle() + "\" added");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Add Magazine not implemented yet!");
				break;
			case 3:
				author = JOptionPane.showInputDialog(filled + "Enter the author");
				AudioCD cd = new AudioCD(title, isbn, publishedYear, author);
				library.addItem(cd);
				JOptionPane.showMessageDialog(null, "Audio CD \"" + cd.getTitle() + "\" added");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Add Video DVD not implemented yet!");
				break;
			}
			operation = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Add", JOptionPane.PLAIN_MESSAGE));
		}
	}

	/**
	 * List library items
	 */
	private static void operationList() {
		String list = library.getNumberOfItems() + " items in library: \n";
		ArrayList<LibraryItem> libraryItems = library.getItems();
		list += "--------------------------------------------------------- \n";
		for (int i = 0; i < libraryItems.size(); i++) {
			LibraryItem item = libraryItems.get(i);
			list += item.getItemInfo();
			list += "--------------------------------------------------------- \n";
		}
		JOptionPane.showMessageDialog(null, list, "List", JOptionPane.PLAIN_MESSAGE);
	}

}
