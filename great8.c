#include<stdio.h>
#include<conio.h>
int main()
{
    int n,i=0,j=0;

    
    for(int i=1;i<5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}
