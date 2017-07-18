import java.util.*;
class great3
{
	public static void main (String[] args){ 
	 	System.out.println("enter number");
	  Scanner in =new Scanner(System.in);
	  Integer number;
	  number=in.nextInt();
	  if(Integer.bitCount(number)==1)
	  {
	  	System.out.println("power of 2");
	  }
	  else
	  {
	  	System.out.println("no a power of 2");
	  }
	}
}
