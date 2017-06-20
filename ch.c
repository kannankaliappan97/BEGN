#include <stdio.h>

int main(){
	unsigned char ch;		
	
	ch=32;
	while(ch<=127){
		printf("%c [%03d] ",ch,ch);
		ch++;
	}
	printf("\n");
	
	return 0;
}


