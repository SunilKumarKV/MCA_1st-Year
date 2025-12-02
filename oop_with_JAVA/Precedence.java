package oop_with_JAVA;
import java.util.Scanner;

public class Precedence{
public static void main(String args[]){

System.out.println("Enter three numbers");
Scanner sc=new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int res1, res2, res3, res4;

System.out.println("Precedence");
res1 = a+b/c;
res2 = a-b*c;
res3 = a/b-c;
res4 = a*b+c;
System.out.println("a+b/c =" +res1);
System.out.println("a-b*c =" +res2);
System.out.println("a/b-c =" +res3);
System.out.println("a*b+c =" +res4);

System.out.println("Precedence");
res1 = a+b-c;
res2 = a-b+c;
res3 = a/b*c;
res4 = a%b+c;
System.out.println("a+b-c =" +res1);
System.out.println("a-b+c =" +res2);
System.out.println("a/b*c =" +res3);
System.out.println("a%b+c =" +res4);

System.out.println("Precedence");
res1 = (a+b)/c;
res2 = (a-b)*c;
res3 = a/(b-c);
res4 = a%(b+c);
System.out.println("(a+b)/c =" +res1);
System.out.println("(a-b)*c =" +res2);
System.out.println("a/(b-c) =" +res3);
System.out.println("a%(b+c) =" +res4);

sc.close();
}
}