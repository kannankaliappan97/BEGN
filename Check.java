import java.io.*;
import java.util.*;
public class Check
{
    public static void main(String args[])
    {
    char ch;
    Scanner ob=new Scanner(System.in);
    ch=ob.nextchar();
    System.out.println("enter the char");
    if((ch>=65&&ch<=91)&&(ch>=97&&ch<=123))
    System.out.println("there is  alpha");
    else
    System.out.println("its not alpha");
    }
}
