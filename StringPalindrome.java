package week1.day2;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM", str1 = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      str1 = str1 + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(str1.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }

	}


