
import java.io.*;
import java.util.*;
class count15
{
public static void main(String[] args){
int x=0,y=1,z,c;
Scanner in=new Scanner(System.in);

c=in.nextInt();
for(int i=0;i<c;i++){
z=x+y;
x=y;
y=z;
System.out.println(z);
}
}
}
