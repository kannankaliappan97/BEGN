import java.util.*;
class sum3
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+i;
             
        }
        sum=sum+n;
        System.out.println(sum);
       
    }
}
