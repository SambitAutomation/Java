import java.util.*;
class FactorialOfANumber
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number :- ");
int a=s.nextInt();
int fact=1;

for(int i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("Result= " + fact);
}
} 
