#include <stdio.h>
int main() 
  {
    int a[50],i,sum=0;
int n;
scanf("%d",&n);
printf("%d",n);
float avg;   
for(i=0;i<n;i++)
    	scanf("%d",&a[i]);
 for(i=0;i<n;i++)
	{
	    sum=sum+a[i];
	}
    avg=sum/n;
    printf("Avg:%f",avg);
    return 0;
  }
