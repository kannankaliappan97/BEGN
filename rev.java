import java.io.*;
import java.util.*;
class rev
    {
        public static void main(String args[])throws IOException
        { Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m;
        int temp=0;
            while(n>0)
            {
    m=n%10;
    temp=m+temp*10;
    n=n/10;
    
            }        
            System.out.print(temp);
        }
    }

