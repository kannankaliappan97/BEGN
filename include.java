import java.util.*;
class include
{
    public static void main(String arg[])
    {
        int odd,sum=0,sum1=0,sum2=0;
        for(int i=0;i<=15;i++)
        {
            sum=sum+i;
                }
                for(int j=15;j<=45;j++)
                {
                    if(j%2!=0)
                    {
                        sum1=sum1+j;
                    }
                }
                sum2=sum+sum1;
                System.out.println(sum2);
        
        
    }
}
