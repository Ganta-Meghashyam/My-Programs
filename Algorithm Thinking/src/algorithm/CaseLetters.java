package algorithm;

public class CaseLetters {

	public static void caseConversion(String str) {

		StringBuilder str1 = new StringBuilder(str);

		for (int i = 0; i < str1.length(); i++) {

			// Checks for lower case character
			if (Character.isLowerCase(str1.charAt(i))) {
				// Convert it into upper case using toUpperCase() function
				str1.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}

			// Checks for upper case character
			else if (Character.isUpperCase(str1.charAt(i))) {
				// Convert it into upper case using toLowerCase() function
				str1.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + str1);
	}
	
	
/////////////////////2nd model////////////////////////////--------------------------		
		public static String ChangeCase(String str) {
		
		String newString = "";
		
		for(int j=0 ; j<str.length() ; j++) {
			char ch = str.charAt(j);
			
			if(ch >='A' && ch <= 'Z')
				newString += (char) (ch+32);
			else if(ch >='a' && ch <= 'z')
				newString += (char) (ch-32);
			else
				newString += ch;
			
		}
		return newString;
	}
		

		
	public static void main(String[] args) {
		
		caseConversion("This Is a SAMPLE text!");
		
		System.out.println(ChangeCase("This Is a SAMPLE text!"));
	}

}
