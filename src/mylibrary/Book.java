/**
 * Book item
 */
package mylibrary;

/**
 * @author juhaes
 *
 */
public class Book extends LibraryItem {

	private String author;
	private String description;

	Book(String title, String isbn, int publishedYear, String author, String description) {
		super(title, isbn, publishedYear);
		this.author = author;
		this.description = description;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getItemInfo() {
		String common = super.getItemInfo();
		return this.author + ": " + common + "\n" + this.description + "\n";
	}


	
}
