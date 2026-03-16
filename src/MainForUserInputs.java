import java.util.Scanner;

class MainForUserInputs {
    public static void main(String[] args) {
        /* Scanner scanner = new Scanner(System.in); // here you let know the program this where's you'll get the input. "System.in" are added we get input using a terminal.

        System.out.print("What is your name?"); // unlike "println", print method doesn't have a new line character at the end of the line
        String name = scanner.nextLine(); // this method is used for taking strings as inputs from the user and name is the string that you save your inputs.

        System.out.println(name);

        scanner.close(); */

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
       /* Scanner scanner = new Scanner(System.in);
       
       System.out.print("What is your name? ");
       String name = scanner.nextLine();

       System.out.printf("Hello %s. How are you?", name); //using format specifier inside a print command using printf

       scanner.close(); */

//---------------------------------------------------------------------------------------------------------------------
       /* Scanner scanner = new Scanner(System.in);

       System.out.print("What is your name? ");
       String name = scanner.nextLine();

       System.out.printf("Hello %s. How old are you? ", name);
       int age = scanner.nextInt();

          // cleans the input buffer  
       scanner.nextLine(); 

       System.out.printf("%d is a excellemt age to start programming. What language do you prefer? ", age);
       String language = scanner.nextLine();

       System.out.printf("%s is a very popular language.", language); 
       
       scanner.close(); */  
       
//--------------------------------------------------------------------------------------------------------- 
       //another method get past input buffer crash use nextLine all input convert them whatever you want.
       Scanner scanner = new Scanner(System.in);

       System.out.print("What is your name? ");
       String name = scanner.nextLine();    

       System.out.printf("Hello %s. How old are you? ", name);
       int age = Integer.parseInt(scanner.nextLine());    // if you want add a double its used as,     double gpa = Double.parseDouble(scanner.nextLine())  
 
       // If you want to find other which one to use you can google it "how to parse Integer from a String in Java" 

       System.out.printf("%d is a excellemt age to start programming. What language do you prefer? ", age);
       String language = scanner.nextLine();

       System.out.printf("%s is a very popular language.", language); 
       
       scanner.close();
    }
}
