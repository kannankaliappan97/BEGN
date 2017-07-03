import java.util.*;
class gcd
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        int gcd=0;
        for(int i=1;i<=n1 && i<n2;i++)
        {
           if((n1%i==0) && (n2%i==0))
           {
               gcd=i;
           }
           
                }
                System.out.print(gcd);
              
                
        
        
    }
}
