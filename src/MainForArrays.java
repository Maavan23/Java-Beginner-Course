import java.util.Arrays;

class MainForArrays {
    public static void main(String[] args) {
       // first array prints a single vowel
       /* char vowels[] = new char[5];
    
       // a e i o u
       vowels[0] = 'a';
       vowels[1] = 'e';
       vowels[2] = 'i';
       vowels[3] = 'o';
       vowels[4] = 'u';

       System.out.println(vowels[2]); */

//---------------------------------------------
      // how to print out the entire array (for this first before main method add "import java.util.Arrays")
       /* char vowels[] = new char[5];
       
       // a e i o u
       vowels[0] = 'a';
       vowels[1] = 'e';
       vowels[2] = 'i';
       vowels[3] = 'o';
       vowels[4] = 'u';
       
       System.out.println(Arrays.toString(vowels)); */

//-----------------------------------------------------------------------------------------------------------
       /* char vowels[] = {'a', 'e', 'i', 'o', 'u'};  
       
       System.out.println(Arrays.toString(vowels)); */

//-----------------------------------------------------
       /* char vowels[] = {'a', 'e', 'i', 'o', 'u'}; 
       
       vowels[2] = 'x';
       
       System.out.println(Arrays.toString(vowels)); */ 
       
//-----------------------------------------------------
       /* char vowels[] = {'a', 'e', 'i', 'o', 'u'};
       
       System.out.println(vowels.length); */ // this shows you the length your array 

//-----------------------------------------------------------------------------------
       /* char vowels[] = {'e', 'u', 'a', 'o', 'i'};
       
       Arrays.sort(vowels);

       System.out.println(Arrays.toString(vowels)); */ // arranges array in alphabetical order

//---------------------------------------------------------------------------------------------
       /* char vowels[] = {'e', 'u', 'a', 'o', 'i'};

       int startingIndex = 1;
       int endingIndex = 4; // here 4 is not inclusive so 4 will not be counted in and startingIndex is 1 that means 0 will also not be be counted
       
       Arrays.sort(vowels, startingIndex, endingIndex);

       System.out.println(Arrays.toString(vowels)); */
       
//---------------------------------------------------------------------------------------------------------------------------------------------------
       // here we look for 'o' in the given array using binary search method 
       // **important: this method will only work on sorted arrays. make sure to sorted it before performing the search**
       /* char vowels[] = {'e', 'u', 'a', 'o', 'i'};

       Arrays.sort(vowels);

       char key = 'o';

       int foundItemIndex = Arrays.binarySearch(vowels, key);

       System.out.println(Arrays.toString(vowels));
       System.out.println(foundItemIndex); */

//-------------------------------------------------------------------------------------------------------------------------
       //binary search method also can take on starting and ending index.    
       /* char vowels[] = {'e', 'u', 'a', 'o', 'i'};

       Arrays.sort(vowels);

       int startingIndex = 1;
       int endingIndex = 4;

       char key = 'o';

       int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);

       System.out.println(Arrays.toString(vowels));
       System.out.println(foundItemIndex); */

//------------------------------------------------------------------------------------------
       //here we show how fill and existing array with chose string or int, or fill array with empty characters
       /* char vowels[] = {'e', 'u', 'a', 'o', 'i'};

       Arrays.fill(vowels, 'x');

       System.out.println(Arrays.toString(vowels)); */

//--------------------------------------------------------------------------------------------------------------
       //here show above array using starting index and ending and ending index
       /* char vowels[] = {'e', 'u', 'a', 'o', 'i'};

       int startingIndex = 1;
       int endingIndex = 4;

       Arrays.fill(vowels, startingIndex, endingIndex, 'x');

       System.out.println(Arrays.toString(vowels)); */
       
//------------------------------------------------------------------------------
       //here shows copies of an Array
       /* int numbers[] = {1, 2, 3, 4, 5};
       
       int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

       Arrays.fill(numbers, 0);

       System.out.println(Arrays.toString(numbers));
       System.out.println(Arrays.toString(copyOfNumbers)); */

//---------------------------------------------------------------------
       //you can also change the length of the copied array to a smaller or a larger number
       //below is a larger number example
       /* int numbers[] = {1, 2, 3, 4, 5};
       
       int copyOfNumbers[] = Arrays.copyOf(numbers, 10);

       System.out.println(Arrays.toString(numbers));
       System.out.println(Arrays.toString(copyOfNumbers)); */
 
//------------------------------------------------------------------------------------------
       //below is a smaller number example
       /* int numbers[] = {1, 2, 3, 4, 5};
       
       int copyOfNumbers[] = Arrays.copyOf(numbers, 2);

       System.out.println(Arrays.toString(numbers));
       System.out.println(Arrays.toString(copyOfNumbers)); */
       
//------------------------------------------------------------
       //giving starting and ending index for a copy array
       /* int numbers[] = {1, 2, 3, 4, 5};

       int startingIndex = 1;
       int endingIndex = 4;
       
       int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

       System.out.println(Arrays.toString(numbers));
       System.out.println(Arrays.toString(copyOfNumbers)); */
       
//-------------------------------------------------------------------------------------
       //Although you can't spevifically define the length of the copiddied array with startingInddex and 
       //endingIndex, you can change the length of the copied array by changing the ending ending index of copyOfRange method
       /* int numbers[] = {1, 2, 3, 4, 5};

       int startingIndex = 1;
       int endingIndex = 10;
       
       int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

       System.out.println(Arrays.toString(numbers));
       System.out.println(Arrays.toString(copyOfNumbers)); */
       
//------------------------------------------------------------------------------------
       //here shows how to compare two arrays 
       int numbers[] = {1, 2, 3, 4, 5};
       
       int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

       System.out.println(Arrays.equals(numbers, copyOfNumbers));
    }
}
