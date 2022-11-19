package stringsprog;

public class MaxOccurChar {
	public static char getMaxOccurChar(String str) {		
		char result=' ';
		int[] count = new int[256];
		//Building character array from the given String
		for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            //System.out.println(str.charAt(i) +"::::"+ count[str.charAt(i)]);
		}
		int max=0;
		for (int i = 0; i < str.length(); i++) {
	            if (max < count[str.charAt(i)]) {
	                max = count[str.charAt(i)];
	                result = str.charAt(i);
	            }
	           
	        }
		return result;
	}

	public static void main(String[] args) {
		//String str = "iNeuron Java";
		String str = "  *&%$$*$$ ";
		System.out.println("The given String is:" +str);
		char ch = getMaxOccurChar(str);
		System.out.println("The maximum occuring char in this String is:" +ch);
	}

}
