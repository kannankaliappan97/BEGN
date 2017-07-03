import java.util.*;
class lcm
{
    public static void main(String arg[])
    {
        int max,min,lcm=1;
        int a,b;
        Scanner ob=new Scanner(System.in);
        int c=ob.nextInt();
        int d=ob.nextInt();
        if(c>d)
        {
            max=c;
            min=d;
        }
        else 
        {
            max=d;
            min=c;
        }
        for(int i=1;i<min;i++)
    {
        a=max*i;
        if(a%min==0)
        {
        lcm=a;
        break;
        
        }
       
        }
   
   System.out.println(lcm);
   } 
}
