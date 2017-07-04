

import java.util.*;
class swap1
{
 public static void main(String[] args)
 {
  System.out.println("ENTER THE INTEGERS: ");
  Scanner s=new Scanner(System.in);
  int n1=s.nextInt();
  int n2=s.nextInt();
  System.out.println("BEFORE SWAPPING: \nn1="+n1+"\nn2="+n2);
  n1=n1^n2;
  n2=n1^n2;
  n1=n1^n2;
  System.out.println("ON SWAPPING:\nn1="+n1+"\nn2="+n2);
 }
}
