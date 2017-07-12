
import java.io.*;
import java.util.*;
class count116{
public static void main(String[] args){
    Scanner ob=new Scanner(System.in);
    String str=ob.nextLine();
    String str1[]=str.split(" ");
    int n=str.length();
    int sum=0,avg,arg;
    char s,l;
    for(int i=0;i<n;i++)
    {
        s=str.charAt(i);
        arg=(int)s;
        sum=sum+arg;
    }System.out.println(sum);
    avg=sum/n;
    l=(char)avg;
    System.out.println(l);

}
}
