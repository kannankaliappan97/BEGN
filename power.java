import java.io.*;
import java.util.*;
class power
{
public static void main(String arg[])

    {
        int n;
        int p;
        Scanner o=new Scanner(System.in);
        n=o.nextInt();
        p=o.nextInt();
        if((n==0)&&(p==0))
         System.out.println("no power");
         if((n>0)&&(p==0))
         System.out.println("power=1");
         if((n>0)&&(p>0))
         while(p>1)
         {
             n=n*n;
             p--;
         }System.out.println(n);
    }
}
