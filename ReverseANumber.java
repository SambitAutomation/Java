import java.util.*;
class ReverseANumber
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
System.out.println(rev);
} 
}
