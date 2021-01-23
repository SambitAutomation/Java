import java.util.*;
class SwappingNumberWithOutThridVariable
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter first number :- ");
int a=s.nextInt();
System.out.println("Enter second number :- ");
int b=s.nextInt();

a=a+b;
b=a-b;
a=a-b;

System.out.println("a :- "+ a);
System.out.println("b :- "+ b);
}
}
