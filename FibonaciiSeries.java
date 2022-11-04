import java.util.*;
class FibonaciiSeries
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your first Number :- ");
int a=s.nextInt();
System.out.println("Enter your second Number :- ");
int b=s.nextInt();
int c=0;

for(int i=0;i<=10;i++)
{
c=a+b;
a=b;
b=c;
System.out.println("data is Listed  " +c);
}

} 
}
