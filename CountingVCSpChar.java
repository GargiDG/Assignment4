package stringsprog;

public class CountingVCSpChar {
	public static void countingVCSpChar(String str) {
		int vowels=0,consonants=0,specialChar=0,digits=0;
		//traversing through the String and finding vowels,consonants and special characters
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			if((ch>='A'&& ch<='Z')||(ch>='a' && ch<='z')) {
				//turning the char into lower case from uppercase for easy evaluation
				//either use this or add +32 to the uppercase char
				ch=Character.toLowerCase(ch);
				//check for vowels
				 if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')
		                    vowels++;
		                else
		                    consonants++;
		            }
		            else if (ch >= '0' && ch <= '9')
		                  digits++;
			//if not alphabets or digits then special char
		            else
		                specialChar++;
				
			}
		System.out.println("The given String has:");		
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
        System.out.println("Special Characters: " + specialChar);
		}
	

	public static void main(String[] args) {
		String str= "iNeuron Java @*)$(*&";		
		System.out.println("The String is:"+str);
		countingVCSpChar(str);
	}

}
