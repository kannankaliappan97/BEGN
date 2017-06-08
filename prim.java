import java.io.*;
import java.util.*;
class prim
{
    public static void main(String a[])
    {
        int n,t,m;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        for( int i=1;i<=n;i++)
        {
              if(n%i==0)
              System.out.println("prime");
            else
            System.out.println("not prime");
        }
                
    }
}
