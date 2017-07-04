import java.util.*;
class swap
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        System.out.println("before swap:");
        System.out.println(n1);
        System.out.println(n2);
        int temp=0;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("after swap:");
        
        System.out.println(n1);
        System.out.println(n2);
    }
}
