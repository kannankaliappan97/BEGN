import java.util.*;
public class spl
{
public static void main(String ar[])throws Exception
{
Scanner ob=new Scanner(System.in);
String str=new String();
int k=0;str=ob.next();
char c[]=str.toCharArray();
for(int i=0;i<c.length;i++)
{
if(c[i]-'0'>=10&&c[i]-'0'<=32)
k++;
}
System.out.println("number of special characters is:"+k);
}
}
