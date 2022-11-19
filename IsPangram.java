package stringsprog;

public class IsPangram {
	//for alphabet size
	static int size=26;
	//check whether part of English alphabet
	static boolean isAlphabetLetter(char ch)
    {
        if((ch>='A'&& ch<='Z')|| (ch>='a'&&ch<='z')) {
        	return true;
        }
        else
            return false;
    }
    public static boolean isAPangram(String str,int len) {
    	String newStr=new String();
    	 boolean[] present = new boolean[size];
    	 
    	 //convert the entire String to lower case
    	for(int i=0; i<len;i++) {
    		if(str.charAt(i)>='A'&& str.charAt(i)<='Z') {
    			newStr=newStr+(char)(str.charAt(i)+32);
    		}
    		else {
    			newStr=newStr+str.charAt(i);
    		}
    	}
    	
    	for (int i = 0; i < len; i++) {
    		 
            // If the current character is a letter of English alphabet
            if (isAlphabetLetter(newStr.charAt(i))) {
 
                //  Mark current letter as present for that index in array
                int letter = newStr.charAt(i) - 'a';
                present[letter] = true;
            }
        }
    	
    	 for (int i = 0; i < size; i++) {
    		 
             // If the current character is not present in string then return false, otherwise return true
             if (!present[i])
                 return false;
         }
    	return true;
    }
	public static void main(String[] args) {
		 //String str = "Abcdefghijklmnopqrstuvwxyz";
		 //String str = "iNeuron Java";
		 String str ="A quick brown fox jumps over the lazy dog";
		 System.out.println("The given String is: "+str);
		 int len= str.length();
		 if (isAPangram(str, len))
	            System.out.println("Yes, the String is a Pangram");
	        else
	            System.out.println("The given string is not a Pangram");
	    }

}
