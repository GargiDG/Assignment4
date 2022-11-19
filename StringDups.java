package stringsprog;

public class StringDups {

	  // Function to make the string unique
    public static String removeDuplicates(String s)
    {
        String str = new String();
         
        // loop to traverse the string and check for repeating chars using IndexOf() method in Java
        for (int i = 0; i <s.length(); i++)
        {
            // character at i'th index of s
            char c = s.charAt(i);
                    
            // if c is present in str, it returns the index of c, else it returns -1
            if (str.indexOf(c) < 0)
            {
            	            	
                // adding c to str if -1 is returned
                str += c;
               
            }
        }
        
        return str;
    }
 
 
    public static void main(String[] args)
    {
        // Input string with repeating chars
        //String s = "MADAAM";
        String s ="iNeeureonN JavvA";
        System.out.println("The given String is: "+s);
        System.out.println("After removing the duplicates from the given "
        		+ "String,the String becomes: ");
        System.out.println(removeDuplicates(s));
    }

}
