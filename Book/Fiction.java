public class Fiction extends Book{

    public Fiction(String BookTitle) {
    	super(BookTitle);
    	setPrice();
		// TODO Auto-generated constructor stub
	}

	@Override
    void setPrice() {
        BookPrice = 24.99;
    }
}
