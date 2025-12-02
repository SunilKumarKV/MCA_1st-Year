#include<stdio.h>

int main(){
// int a = 10;
// int *p = &a;
// (*p)++;
// printf("%d", a);

int a = 10;
int *p = &a;
int *q = (int*)&p;

*q = 50;
printf("%d %d", a, *p);
}