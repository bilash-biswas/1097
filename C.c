#include<stdio.h>
int main()
{
    int n,i,j,k=6;
    for(i=1;i<=9;i=i+2)
    {
       for(j=i+k;j>=i+k-2;j--)
       {
           printf("I=%d J=%d\n",i,j);
       }
       //k=k+2;
    }

    return 0;
}
