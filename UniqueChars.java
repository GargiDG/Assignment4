package stringsprog;

public class UniqueChars {

	public static void main(String[] args) {

		String str = "A&*BC@#DE";
		//String str="Gargi";
		//String str = "GarGi";
		//String str = "ABCD";
		
		int count=0;
		System.out.println("The Unique characters present here:");
		for(int i=0; i<str.length();i++) {
			int k=0;
			for(int j=0; j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && i!=j) {
				 	k=1;
				 	break;
				  }
			    }
				if(k==0) {					
					System.out.print(str.charAt(i));
					count++;
				}
			}
		System.out.println();
		if(count==str.length()) {
			System.out.println("The given String is full of unique characters");
		}
		else {
			System.out.println("The given String is not made entirely of unique characters");
		}
			
		}

	}


