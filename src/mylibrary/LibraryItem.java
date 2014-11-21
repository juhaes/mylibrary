/**
 * 
 */
package mylibrary;

/**
 * @author juhaes
 *
 */
public class LibraryItem {

	private String title;
	private String isbn;
	private int publishedYear;
	
// To Loan class:
//	protected boolean isLoaned;
//	protected LocalDateTime returnDate;   // Vaatii JDK 1.8
//  public abstract void loanItem();

	LibraryItem(String title, String isbn, int publishedYear) {
		this.title = title;
		this.isbn = isbn;
		this.publishedYear = publishedYear;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the publishedYear
	 */
	public int getPublishedYear() {
		return publishedYear;
	}

	/**
	 * @param publishedYear the publishedYear to set
	 */
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	public String getItemInfo() {
		return this.title + ", " + this.publishedYear + " (ISBN " + this.isbn + ")";
	}
		
}
