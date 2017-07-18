#include <stdio.h>
int main() 
  {
    int a[10],i,g,l;
    for(i=0;i<10;i++)
    	scanf("%d",&a[i]);
    g=a[0];l=a[0];
    for(i=0;i<10;i++)
		if(a[i]>g)
			g=a[i];
    printf("Great:%d\n",gt);
    for(i=0;i<10;i++)
		if(a[i]<l)
			l=a[i];
    printf("Lower:%d",l);
    return 0;
  }
