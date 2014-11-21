/**
 * 
 */
package mylibrary;

import java.util.ArrayList;

/**
 * @author juhaes
 *
 */
public class Library {

	private ArrayList<LibraryItem> libraryItems;

	/**
	 * 
	 */
	public Library() {
		libraryItems = new ArrayList<LibraryItem>();
	}

	public void addItem(LibraryItem item) {
		libraryItems.add(item);
	}

	public ArrayList<LibraryItem> getItems() {
		return libraryItems;
	}

	public int getNumberOfItems() {
		return libraryItems.size();
	}

}
