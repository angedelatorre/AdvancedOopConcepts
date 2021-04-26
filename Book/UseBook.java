public class UseBook 
{
	public static void main (String [] args)
	{
	
		Book book;
		System.out.print("Fiction Book: ");
		book = new Fiction ("Pinnochio");
		System.out.println(book.getBookTitle() + " for $" + book.getBookPrice());
		
		System.out.print("Non Fiction Book: ");
		book = new NonFiction ("The Prince");
		System.out.println(book.getBookTitle() + " for $" + book.getBookPrice());
	}
}