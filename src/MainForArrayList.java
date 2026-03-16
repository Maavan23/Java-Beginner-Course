import java.util.ArrayList;
import java.util.Comparator;

class MainForArrayList {
    public static void main(String[] args) {
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.toString()); */

        /* <Integer> is the reference type form of regular integer which are primitive type integers like int. 
        Just like <Integer> , there is also <Double>, <Float>, <Boolean> of reference type forms. When creating a 
        Arraylist you can't use primitive int types you have to use Integer wrapper class.*/

//----------------------------------------------------------------------------------------------------------------
        //here we print out a single value from the array list
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(4); // 3
        numbers.add(5); // 4

        System.out.println(numbers.get(2));  */ //get method takes an integer which will be index of value you are trying print
        
//------------------------------------------------------------------------------------------------------------------------------
        //ArrayLists are dynamic. So you can add as meny elements as you like want using add and you can also remove 
        //elements from a ArrayList using ".remove"
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(4); // 3
        numbers.add(5); // 4

        numbers.remove(2); // here you type the index of the value like before in get method

        System.out.println(numbers.toString()); */
        
//--------------------------------------------------------------------------------------------
        //You can also remove items by value 
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(4); // 3
        numbers.add(5); // 4

        numbers.remove(Integer.valueOf(4)); //pass the primitive type instead of index value in when using ".remove()"
        
        System.out.println(numbers.toString()); */

//----------------------------------------------------------------------------------------------------------------------
        //below shows how to remove all elements of an array list from and make it empty
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(4); // 3
        numbers.add(5); // 4

        numbers.clear();
        
        System.out.println(numbers.toString()); */

//-----------------------------------------------------------------------------------------
        //how to update a element isnide an array list
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(4); // 3
        numbers.add(5); // 4

        numbers.set(2, Integer.valueOf(30)); // 2 here's the index value. Integer.valueOf(30) means we'll replace value with 30
        
         System.out.println(numbers.toString()); */

//--------------------------------------------------------------------------------------------------------------------------------
        //how to sort a array list
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5); 
        numbers.add(3); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(2); 

        numbers.sort(Comparator.naturalOrder());   //you have add comporator very in the beginning of the program(line 2) using "import" 
        
        System.out.println(numbers.toString()); */
              
//----------------------------------------------------------------------------------------------------------------------------------------
        //how to reverse the order
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5); 
        numbers.add(3); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(2); 

        numbers.sort(Comparator.reverseOrder());    
        
        System.out.println(numbers.toString()); */
        
//----------------------------------------------------
        //size method. this shows how many elements there are inside an array list
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5); 
        numbers.add(3); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(2); 

        System.out.println(numbers.size()); */
        
//------------------------------------------------------------------------------------
        //contains method. this can check whether an array list contains a certain avalue or not
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5); 
        numbers.add(3); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(2); 

        System.out.println(numbers.contains(Integer.valueOf(1)));
        System.out.println(numbers.contains(Integer.valueOf(10))); */
        
//---------------------------------------------------------------------------------------------
        //isempty method. this can check whether an array list contains anything at all or not
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5); 
        numbers.add(3); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(2); 

        System.out.println(numbers.isEmpty()); */ //here out is false because there elements in this array list [5, 3, 1, 4, 2]

//----------------------------------------------------------------------------------------------------------------------------
        //below program's output will be flase beacauase ".clear()" method removes all elements in the existing array list 
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5); 
        numbers.add(3); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(2); 

        numbers.clear(); //this removes all elements within the array list

        System.out.println(numbers.isEmpty());  */
        
//----------------------------------------------------------------------------------------------------------------------------
        //special for loop that used to loop over in an array list
        /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5); 
        numbers.add(3); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(2);

        System.out.println("before: "+ numbers.toString());

        numbers.forEach(number ->  {
            System.out.println(number *2);
        });

        System.out.println("after: "+ numbers.toString()); */

//----------------------------------------------------------------------
        //this one automatically upadates the arraylist with new values ca;culated from above program. 
        //this program is updated version of above program
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5); 
        numbers.add(3); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(2);

        System.out.println("before: "+ numbers.toString());

        numbers.forEach(number ->  {
             numbers.set(numbers.indexOf(number), number *2);  //indexOf is a another method that return the index of given value 
        });

        System.out.println("after: "+ numbers.toString());  
    }
}
