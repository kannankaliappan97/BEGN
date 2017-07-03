import java.io.*;
class q5
{
	public static void main(String args[]) throws IOException
	{
		String str;
		int chr = 0, digits = 0, letter = 0;
		char ch;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a String : ");
		str = br.readLine();

		for(int i = 0; i < str.length(); i ++)
		{
			ch = str.charAt(i);
            if(Character.isDigit(ch))
				digits ++;
			else if(Character.isLetter(ch))
				letter ++;
		}

	
		System.out.println("Digits : " + digits);
		System.out.println("Letter : " + letter);
		
	}
}
