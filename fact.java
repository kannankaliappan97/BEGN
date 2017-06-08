import java.io.*;
import java.util.*;
class fact
{
    public static void main(String a[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int fact1=1;
        if(n<0)
        System.out.println("no fact");
        else if(n==0)
        System.out.println("fact=1");
        else
        for(int i=1;i<n;i++)
        {
            fact1=fact1*i;
    
        }
    System.out.println(fact1);
    }
}
