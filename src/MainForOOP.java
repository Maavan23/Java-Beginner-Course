import java.time.LocalDate;

class MainForOOP {
   public static void main(String[] args) {
      /* User youngerUser = new User();

      youngerUser.name = "Tony Stark";
      youngerUser.birthDay = LocalDate.parse("1986-02-14"); // "Localdate.parse" method can parse a date from a given string convert it to local date type

      System.out.printf("%s was born back in %s", youngerUser.name, youngerUser.birthDay.toString());  */

//-------------------------------------------------------------------------------------------------------------------------------------------------------------
      //shows age of the user
      /* User youngerUser = new User();

      youngerUser.name = "Tony Stark";
      youngerUser.birthDay = LocalDate.parse("1986-02-14"); // "Localdate.parse" method can parse a date from a given string convert it to local date type

      System.out.printf("%s was born back in %s and he is now %d years old.", youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());  */
      
//------------------------------------------------------------------------------------------------------------------------------------------------------------
      // two users
      /* User youngerUser = new User();

      youngerUser.name = "Tony Stark";
      youngerUser.birthDay = LocalDate.parse("1986-02-14"); // "Localdate.parse" method can parse a date from a given string convert it to local date type

      
      System.out.printf("%s was born back in %s and he is now %d years old.", youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());     

      User olderUser = new User();

      olderUser.name = " Rick Flag Sr";
      olderUser.birthDay = LocalDate.parse("1963-03-06");

      System.out.printf("%s was born back in %s and he is now %d years old.", olderUser.name, olderUser.birthDay.toString(), olderUser.age());  */
      
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
      // implements the functionality of borrowing books 
      /* User user = new User();

      user.name = "Tony Stark";
      user.birthDay = LocalDate.parse("1986-02-14"); // "Localdate.parse" method can parse a date from a given string convert it to local date type

      Book book = new Book();

      book.title = "Carmila";
      book.author = "Sheridan Le Fanu";

      user.borrow(book);
      
      System.out.printf("%s was born back in %s and he is now %d years old.", user.name, user.birthDay.toString(), user.age());

      System.out.printf(" %s has borrowed thses books; %s \n", user.name, user.books.toString());  */

//------------------------------------------------------------------------------------------------------------------------------------------------------
      /* User user = new User("Tony Stark", "1986-02-14");

      Book book = new Book();

      book.title = "Carmila";
      book.author = "Sheridan Le Fanu";

      user.borrow(book);
      
      System.out.printf("%s was born back in %s and he is now %d years old.", user.name, user.birthDay.toString(), user.age());

      System.out.printf(" %s has borrowed thses books; %s \n", user.name, user.books.toString()); */

//----------------------------------------------------------------------------------------------------------------------------------------
      Book carmila = new Book("Carmila", "Sheridan Le Fanu", 270); //constructor method use in Book.java through get methods
      AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);
      Ebook jeeves = new Ebook("Carry on Jeeves", "P. G. Wodehouse", 290, "PDF");

      System.out.println(dracula.toString());
      System.out.println(jeeves.toString());

   } 
}
