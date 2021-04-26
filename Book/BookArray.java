public class BookArray {

    public static void main(String[] args) {
        
        //Creating Book array which stores Fiction and Non-Fiction Book Objects
    		
    		Book bookArray[]= new Book [10];
        
        	bookArray[0]= new Fiction ("THE BEETLE");
        	bookArray[1]= new Fiction ("THE BELL JAR");
        	bookArray[2]= new Fiction ("CATCH-22");
        	bookArray[3]= new Fiction ("HAM ON RYE");
        	bookArray[4]= new Fiction ("THE HELP");
            bookArray[5]= new NonFiction ("THE BABYSITTER");
            bookArray[6]= new NonFiction ("THE BIG ORDEAL");
            bookArray[7]= new NonFiction  ("ALL IN: AN AUTOBIOGRAPHY");
            bookArray[8]= new NonFiction("THE PSYCHOPATH");
            bookArray[9]= new NonFiction ("THE DIARY OF A YOUNG GIRL");

        //This for loop will displays the Each Fiction and Non-Fiction book details
        for(int i=0; i< bookArray.length; i++)
        {
            //Displaying the information of each book
            System.out.println(bookArray[i].getBookTitle() + " = $ " + bookArray[i].getBookPrice()  + "\n" );
        }
    }

}