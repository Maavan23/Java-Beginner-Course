class MainForLoops {
    public static void main(String[] args) {
        //for loops
        /* for(int number = 1; number <= 10; number++) {
            System.out.println(number);
        } */

        /* Parts of a Loop,
        1.Intialization.  ex:- int number = 1;
        2.Condition that we are checking againt.  ex:- number <= 10;
        3.Loop Body.
            This where print statement for the loop reside. Anything you write withing curly braces of your loop 
            will be the loop body.
               ex:- System.out.println(number);
        4.Update. 
             Here we will update the value of the number variable.
               ex:- number++
                 */    

//---------------------------------------------------------
        //you can for loop to loop over an array
        /* int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int index = 0; index <= numbers.length; index++) {
            System.out.println(numbers[index]);       
        } */

//---------------------------------------------------------------
        //inside a array used for loop you can print sum of the values   
        /* int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for(int index = 0; index < numbers.length; index++) {
            sum += numbers[index];      
        }

        System.out.println(sum); */

//-----------------------------------------------------------------------
        //here we printout multiplication tables of an any number using nested for loops
        /* int number = 5;
        
        for(int multiplier = 1; multiplier < 10; multiplier++) {
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
        } */

//-----------------------------------------------------------------------------------------
        //advanced multplication table through nested loops
        /* for(int number = 1; number <= 10; number++) {
            for(int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
            } 
        } */
       
//----------------------------------------------------------------------------------------------
        //Using If else statement inside a for loop example 
        /* for (int number = 1; number <= 50; number++) {
            if(number % 2 == 1) {
                System.out.println(number);
            }
        } */
        
//------------------------------------------------------------
        //another variant of for loop that makes looping over collections
        //such as arrays much easier  
        /* int numbers[] = {1, 2, 3, 4, 5};
        
        for(int number : numbers) {
            System.out.println(number);
        } */

        /* for(int number: numbers) meaning:-
           For every single mnumber on the array, you want to print them out using an integer
           as a index accessing the elements individually. You are kind of taking a shortcut 
           and exteracting each value from the numbers array and putting them in the number 
           variable on each iteration.*/

//---------------------------------------------------------------------------------------------
        //You can use the above example to print sum off all numbers of array
        /* int numbers[] = {1, 2, 3, 4, 5};

        int sum = 0;
        
        for(int number : numbers) {
            
            sum += number;
        }
        
        System.out.println(sum); */

//----------------------------------------------------------------------------
        //while loop example
        /* int number = 5;
        int multiplier = 1;
        
        while (multiplier <= 10) {
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);

            multiplier++;
        } */

        /* Difference between a while loop and a for loop is the fact that while loop 
        only has one component which is thje condition. In case of a for loop we had the 
        initialization, condition, loop body, and the update part but in this there is just 
        the condition and the loop body. You will to do the initializations outside of the 
        for loop and you will have perform the the update(incremetaion) of the multiplier or 
        whatever you are working with inside the loop body.*/

//---------------------------------------------------------------------------------------------
        //dp while loop example
        int number = 5;
        int multiplier = 1;

        do {
           System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);

            multiplier++;  
        } while (multiplier <= 10);

        /* Main difference between a while loop and a do while loop is the fact that in this case first
        the loop body will be executed and then the condition will be checked wherease in case of  while loop 
        condition gets evaluated and then the loop body gets executed. */  
    }    
}


