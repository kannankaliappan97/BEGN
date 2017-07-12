import java.util.*;
public class count14
{
public static void main(String ar[])
{
    Scanner ob=new Scanner(System.in);
 int m[]=new int[10];
for(int i=0;i<10;i++)
{
    m[i]=ob.nextInt();
}
int temp =m[0];
for(int i=0;i<10;i++)
{
    if(temp<m[i])
    {
        temp=m[i];
        
    }
}System.out.println(temp);
}
}
