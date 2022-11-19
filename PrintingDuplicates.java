package stringsprog;

public class PrintingDuplicates {
		public static void printDuplicates(String str)	{
			//creating an array to store all characters
			int[] count=new int[256];
			//traverse the String and store the occurrence of characters in the array
			for(int i=0; i<str.length();i++) {
				count[str.charAt(i)]++;				
			}
			//if in that array where the chars are stored it is stored more than 1 print those
			  for (int i = 0; i < 256; i++)
		            if (count[i] > 1)
		                System.out.println((char)(i) +":: count = " + count[i]);
		    }
		
	 
	    public static void main(String[] args)
	    {
	        // Input string with repeating chars
	        //String str = "MADAAM"; 
	        String str= "Hi$ppoppot%*$tammmmusss$$$sss";
	        printDuplicates(str);
	    }

	}

