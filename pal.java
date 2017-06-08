import java.io.*;
import java.util.*;
class pal
{
    public static void main(String arg[])
    {
        int n,t,re=0;
        int m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=n;
        while(n>0)
        {
            t=n%10;
            re=(re*10)+t;
            n=n/10;
        }
        if(m==re)
        System.out.println("polyndrom");
        else
        System.out.println("non polndrome");
    }
}
