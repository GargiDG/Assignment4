package stringsprog;

public class IsAnagram {
	//Sort a String array
	public static String sortedArray(String s) {
		 char arr[] = s.toCharArray();
		 
	        char temp;
	 
	        int i = 0;
	        while (i < arr.length) {
	            int j = i + 1;
	            while (j < arr.length) {
	                if (arr[j] < arr[i]) {
	                   
	                    // Comparing the characters one by one
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	                j += 1;
	            }
	            i += 1;
	        }
	     //Converting the char array back to a string   
	    String str=String.valueOf(arr);
		return str;		
	}
    public static boolean isAnagram(String str1,String str2) {
    	//If the length of the two Strings are not same return without checking further
    	if(str1.length()!=str2.length()) 
    		return false;
    	
    	//Sort the String Arrays
    	str1=sortedArray(str1);
    	str2=sortedArray(str2);
    	
    	  // Compare sorted strings
        for (int i = 0; i < str1.length(); i++)
            if (str1.charAt(i)!=str2.charAt(i))
                return false;
        
    	return true;
    }
	public static void main(String[] args) {
        String str1="Gargi";
        String str2="gaiGr";
        if (isAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");

	}

}
