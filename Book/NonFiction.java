public class NonFiction extends Book{

    public NonFiction(String BookTitle) {
    	super( BookTitle);
    	setPrice();
		// TODO Auto-generated constructor stub
	}

	@Override
    void setPrice() {
        BookPrice = 37.99;
    }
}
