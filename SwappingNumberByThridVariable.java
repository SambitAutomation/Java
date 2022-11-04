import java.util.*;
class SwappingNumberByThridVariable
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter first number :- ");
int a=s.nextInt();
System.out.println("Enter second number :- ");
int b=s.nextInt();

int c; 
  
    c=a;
    a=b;
    b=c;
 
System.out.println("a :- " + a);
System.out.println("b :- " + b);
}
}


