class MainForString {
   public static void main(String[] args) {
     // char percentSign = '%';

     // System.out.println(percentSign);  //a single character is stored

//------------------------------------------------------------------------------
     // String name = "Sasindu Kaveesha Gamapathirana";

     // System.out.println(name);

//------------------------------------------------------------------------------
     // String name = new String("Sasindu Kaveesha Gamapathiarana");
      
     // System.out.println(name);

//------------------------------------------------------------------------------
     /* String literalString1 = "abc";
     String literalString2 = "abc"; 

     String objectString1 = new String("xyz");
     String objectString2 = new String("xyz");

     System.out.println(literalString1 == literalString2);

     System.out.println(objectString1 == objectString2); */

//------------------------------------------------------------------------------
     /* String name = "Sasindu Kaveesha Gamapathirana";
     String country = "Sri Lanka";
     int age = 25;
     String company = "freeCodeCamp";

     System.out.println("Hello World! I am "+ name +". I am from "+ country  +" and I am "+ age +" years old. I work for "+ company + "."); */    

//---------------------------------------------------------------------------------------------------------------------------------------------------
     /* String name = "Sasindu Kaveesha Gamapathirana";
     String country = "Sri Lanka";
     int age = 25;
     String company = "freeCodeCamp";
     double gpa = 3.8;
     char percentSign = '%';
     boolean amITellingTheTruth = false;

     String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attentded 100%c of my university classes. These are all %b claims", name, country, age, company, gpa, percentSign, amITellingTheTruth);

     System.out.println(formattedString); */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     /* String name = "Sasindu Kaveesha Gamapathirana"; // %s
     String country = "Sri Lanka"; 
     int age = 25; // %d
     String company = "freeCodeCamp";
     double gpa = 3.8; // %f
     char percentSign = '%'; // %c
     boolean amITellingTheTruth = false; // %b

     System.out.println(String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attentded 100%c of my university classes. These are all %b claims.", name, country, age, company, gpa, percentSign, amITellingTheTruth));     // just use above method for now. do not use this shortend method now demonstrated because down the line, you will learn Print F function later on this course. that actually let you use format specifiers right in the print function. */

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     /* String name = "Sasindu Kaveesha Gamapathiarana";
     
     System.out.println(name.length());   // shows name string's length
     System.out.println(name.isEmpty());  // checks the name is empty or not */

//-------------------------------------------------------------------------------
     /* String name = "Sasindu Kaveesha Gamapathiarana";
     
     System.out.println(name.toUpperCase()); // turn lowercase string to uppercase
     System.out.println(name.toLowerCase()); // turn uppercase string to lowercase 
     System.out.println(name); */

//---------------------------------------------------------------------------------
     /* String string1 = new String("abc");   
     String string2 = new String("abc");   

     System.out.println(string1 == string2);  // program's output false because string1 ansd string are seperate object beacuse newString method. */

//---------------------------------------------------------------------------------------------------------------------------------------------------
     /* String string1 = new String("abc");   
     String string2 = new String("abc");  
     
     System.out.println(string1.equals(string2)); // now program's output is true because this method can checks one object is equal to other. But if you change string2 "abc" to "ABC" output will be false because valuses are different */

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     /* String string1 = new String("abc");   
     String string2 = new String("abc");  
     
     System.out.println(string1.equalsIgnoreCase(string2)); // now program's output is true because we specifically gave a command to ignore the each valuse's cases using ".equalsIgnoreCase" method */

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     /* String string = "The sky is blue";
     
     System.out.println(string.replace("blue", "red"));  // replace part of the string
     System.out.println(string); */

//-------------------------------------------------------------------------------------
       /* String string = "The sky is blue";

       String updatedString = string.replace("blue", "red");

       System.out.println(updatedString);     // An other method to replace */

//-----------------------------------------------------------------------------
     String string = "The sky is blue";
     
     System.out.println(string.contains("sky")); // checks whether this string contain word "sky" or not
     System.out.println(string.contains("freeCodeCamp")); // This programs outputs shows "freeCodeCamp" is not a word of this string     
   }    
}
