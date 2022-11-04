import java.util.*;
class PrimeNumber 
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a Number : ");
int a=s.nextInt();
int temp=0;

for(int i=2;i<=a-1;i++)
{
if(a%i==0)
{
temp=temp+1;
}
}
if(temp==0)
{
System.out.println("prime Number");
}
else
System.out.println("Not prime Number");
}
}
