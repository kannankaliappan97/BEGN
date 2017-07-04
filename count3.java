import java.util.*;
import java.io.*;

public class count3
{  
    public static void main(String[]args) throws FileNotFoundException        
    {  Scanner ob=new Scanner(System.in);
    String str=ob.nextLine();
    String str1[]=str.split(" ");
      int count=0;
   String str2;
    for(String item:str1)
    {
       count++;
    }
           
            System.out.println( count);
    }
}
