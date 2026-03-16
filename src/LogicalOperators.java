class LogicalOperators {
    public static void main(MainForString[] args) {
        int age = 45;

        // age >= 18
        // age <= 40
        // Above is logical AND Operator

        //System.out.println(age >= 18 && age <= 40);
//---------------------------------------------------------------

        // boolean isStudent = false;
        // boolean isLibraryMember = true;

        // below is the logical OR Operator
        // System.out.println(isStudent || isLibraryMember);       

//---------------------------------------------------------------
        // boolean isStudent = false;

        // below is the NOT Operator(This is an one of unary operators)
        // System.out.println(!isStudent); 

//-------------------------------------------------------------------------------------------
        // boolean isStudent = false;
        // boolean isLibraryMember = false;
        
        // System.out.println(!isStudent || isLibraryMember);

        // this Reversing a OR Operator same can be done to the AND Operator too

//-------------------------------------------------------------------------------------------   

        // int score = 0;
        // int turns = 10;

        // score++;  //++ increase its value by 1
        // turns--;  //-- decrease its value by 1

        // System.out.println(score);
        // System.out.println(turns);

        // These are uses of Increment Operator and Decrement Operator.  
        // Thsese operators are part of Unary Operators 

//--------------------------------------------------------------------------
          
        int number = 55;

        // System.out.println(number++);     //add 1 to its its memory but not print yout print number in next line 
        // System.out.println(number);      
        
        // System.out.println(number--);     //minus 1 to its its memory but not print yout print number in next line 
        // System.out.println(number);
        
        // System.out.println(++number);     //add 1 to its memory now next is number, so increment happens, because it was added earlier   
        // System.out.println(number);
        
        // System.out.println(--number);     //minus 1 to its memory now next is number, so decrement happens, because it was added earlier
        // System.out.println(number); 

        number++;

        System.out.println(number); 
    }     
}
