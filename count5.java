
import java.util.*;
public class count5 {
	public static void main(String[] args){
		System.out.println("Enter the para");
		Scanner ob=new Scanner(System.in);
		String str=ob.nextLine();
		int Count=0;
		ob.close();
		String[] List = str.split("[!?.:]+");
        Count += List.length;
		System.out.println(Count);
	}

}
