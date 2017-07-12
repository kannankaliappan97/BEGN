import java.util.*;

public class alla {
public static void main(String[] arg) {
	Scanner ob=new Scanner(System.in);
	String str=ob.next();
	int count=0;
	for(int i=0;i<str.length();i++)
	{
	if(Character.isDigit(str.charAt(i)))
	{
		count++;
	}
}
	if(count>=0)
	{
		System.out.println("the numeric count is:"+count);
	}
	else if(count==0)
	{
		System.out.println("there is no numeric integer");
	}
}
}
