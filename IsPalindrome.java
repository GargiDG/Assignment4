package stringsprog;

public class IsPalindrome {

	public static void main(String[] args) {
		String str = "2552";
		boolean flag=false;
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else if(str.charAt(i)!=str.charAt(j)) {
				flag=true;
				break;
		}
		}
		if(flag==false) {
			System.out.println("Palindrome");		
		}
		else 
			System.out.println("Not Palindrome");
		
	}

}
