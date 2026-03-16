import java.util.HashMap; 

class MainForHashMaps {
    public static void main(String[] args) {
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       System.out.println(examScores.toString()); */

//---------------------------------------------------------------------------------
       //how to print out single value from a Hash map
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       System.out.println(examScores.get("English"));  */
       
//---------------------------------------------------------------------------------
       // put if absent method. this fisrt checks if a value already exists in the hashmap or not if it doesn't it will 
       //put it otherwise it will just skip it.
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.putIfAbsent("Math", 78);

       System.out.println(examScores.toString());  */
       
//-----------------------------------------------------------------------------------------------------------------------
       //how to replace one of the values in a Hash map
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.replace("Math", 78);

       System.out.println(examScores.toString());  */
       
//--------------------------------------------------------------------------------
       // get or deafult. this returns -1 if given key is not found
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       System.out.println(examScores.getOrDefault("Astrology", -1));  */
       
//--------------------------------------------------------------------------------
       // how to clear a Hash map
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.clear();

       System.out.println(examScores.toString());  */
       
//--------------------------------------------------------------------------------
       // how to check the number of elements that exist on the hasm map
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       System.out.println(examScores.size());  */
       
//---------------------------------------------------------------------------------
       // how to remove an item from a Hash map
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.remove("Sociology");

       System.out.println(examScores.toString());   */
       
//---------------------------------------------------------------------------------
       // how to check a certain item exists on the hash map or not. Method 1 - check for the key 
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.remove("Sociology");

       System.out.println(examScores.containsKey("Math"));  */

//----------------------------------------------------------------------------------------------
       // how to check a certain item exists on the hash map or not. Method 2 - check for the value
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.remove("Sociology");

       System.out.println(examScores.containsValue(Integer.valueOf(100)));  */
       
//------------------------------------------------------------------------------------------------------
       // how to check if a hashmap is empty or not 
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.remove("Sociology");

       System.out.println(examScores.isEmpty());  */
       
//----------------------------------------------------------------------------------
       // special for loop used to loop over in a Hash map
       /* HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score); 
       });  */

//---------------------------------------------------------------------------------
       //here we will loop over the entire hash map and we update the value of subject score
       HashMap<String, Integer> examScores = new HashMap<String, Integer>();
       
       examScores.put("Math", 75);
       examScores.put("Sociology", 85);
       examScores.put("English", 95);
       examScores.put("History", 75);
       examScores.put("Physics", 78);
       examScores.put("Chemistry", 80);

       examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10); // here 10 marks will  be reduced from each subject
       });       

       System.out.println(examScores.toString());
    }
}
