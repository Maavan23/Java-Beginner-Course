public class Ebook extends Book {
   private String format;

    Ebook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount); // super is reference to the parentclas of our current class

        this.format = format;
    } 
}