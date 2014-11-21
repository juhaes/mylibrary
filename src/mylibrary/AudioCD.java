/**
 * 
 */
package mylibrary;

import java.util.ArrayList;

/**
 * @author juhaes
 *
 */
public class AudioCD extends LibraryItem {

	private String author;
	private ArrayList<String> trackList;

	AudioCD(String title, String isbn, int publishedYear, String author) {
		super(title, isbn, publishedYear);
		this.author = author;
	}

	@Override
	public String getItemInfo() {
		String common = super.getItemInfo();
		return this.author + ": " + common + "\n";
	}

	
	
}
