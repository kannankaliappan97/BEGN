#include <stdio.h>
#include<string.h>
int main(void) {
	
	char ch[100],ch1[100];
	scanf("%s %s",ch,ch1);
       int i;
      if(strlen(ch)!=strlen(ch1))
          printf("%s  %s are not equal",ch,ch1);
        else
        {
        	int count=0;
           for(i=0;i<strlen(ch);i++)
           {
           	if(ch[i]==ch1[i])
           	  count++;
           }
        
        if(count==strlen(ch))
            printf("%s ,%s are equal",ch,ch1);
         else
           printf("%s, %s are not equal",ch,ch1);
           }
        
	return 0;
}
