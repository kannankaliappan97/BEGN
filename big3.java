import java.util.*;
class big3
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        int n3=ob.nextInt();
        if((n1>n2)&&(n1>n3))
        {
            System.out.println(n1);
        }
        else if((n1<n2)&&(n2>n3))
        {
            System.out.println(n2);
        }
        else
        {
            System.out.println(n3);
        }
    }
}
