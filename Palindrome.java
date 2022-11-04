import java.util.*;
class Palindrome 
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Type your fav. number :- ");
int a=s.nextInt();
int temp=a;
int rev=0,rem;

while(temp != 0)
{
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(rev==a)
{
System.out.println("It's a Palindrome Number");
}
else
System.out.println("It's Not a Palindrome Number");
}
}
