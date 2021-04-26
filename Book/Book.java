
public abstract class Book {
	public String BookTitle;
    public double BookPrice;
    
    public Book (String BookTitle) {
		this.BookTitle = BookTitle;
    }
	public String getBookTitle() {
		return BookTitle;
	}
	public double getBookPrice() {
		return BookPrice;
	}

	abstract void setPrice();
}
