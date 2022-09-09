package week1.day2;

public class changeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charArray1 = test.toCharArray();
		for (int i=0; i<charArray1.length; i++)
		{
			char c = charArray1[i];
			
			if (i %2 !=0)
			{
			c = Character.toUpperCase(c);
			}
			System.out.print(c);
		}
	}

}
