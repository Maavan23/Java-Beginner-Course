import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
   /* public String name;
   public LocalDate birthDay;      // reference type for storing dates in Java  
   public ArrayList<Book> books = new ArrayList<Book>();

   User(String name, String birthDay) {
         this.name = name;
         this.birthDay = LocalDate.parse(birthDay);
   }

   public User() {
      //TODO Auto-generated constructor stub
   }

   public void borrow(Book book) {     // this return type returns nothing that's why void is used
      this.books.add(book);
   }

   public int age() {
      Period age = Period.between(this.birthDay, LocalDate.now());

      return age.getYears();    */

//--------------------------------------------------------------------------------------------------------------------------
   /* private String name;
   private LocalDate birthDay;      // reference type for storing dates in Java  
   private ArrayList<Book> books = new ArrayList<Book>();

   User(String name, String birthDay) {
         this.name = name;
         this.birthDay = LocalDate.parse(birthDay);
   }

   public String getName() {
      return this.name;
   }

   public String getBirthDay() {
      return this.birthDay.toString();
   }

   public String borrowedBooks() {
      return this.books.toString();
   }


   public void borrow(Book book) {     // this return type returns nothing that's why void is used
      this.books.add(book);
   }

   public int age() {
      Period age = Period.between(this.birthDay, LocalDate.now());

      return age.getYears();    */

//--------------------------------------------------------------------------------------------------------
   private String name;
   private LocalDate birthDay;      // reference type for storing dates in Java  
   private ArrayList<Book> books = new ArrayList<Book>();

   User(String name, String birthDay) {
         this.name = name;
         this.birthDay = LocalDate.parse(birthDay);
   }

   public String getName() {
      return this.name;
   }

   public String getBirthDay() {
      return this.birthDay.toString();
   }

   public String borrowedBooks() {
      return this.books.toString();
   }


   public void borrow(Book book) {     // this return type returns nothing that's why void is used
      this.books.add(book);
   }

   public int age() {
      Period age = Period.between(this.birthDay, LocalDate.now());

      return age.getYears(); 
   
   }
}
