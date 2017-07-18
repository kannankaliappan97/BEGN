import java.util.*;
class great2
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        int l1=ob.nextInt();
        int l2=ob.nextInt();
        int a1[]=new int[l1];
        int a2[]=new int[l2];
        if(l1==l2)
        {
        for(int i=0;i<l1;i++)
        {
            a1[i]=ob.nextInt();
        }
        for(int i=0;i<l2;i++)
        {
            a2[i]=ob.nextInt();
        }
        for(int i=0;i<l1;i++)
        {
            a1[i]=a1[i]+a2[i];
             System.out.println(a1[i]);
        }
    
    }
    else
    {
        System.out.println("data corrupt");
    }
    }
}
