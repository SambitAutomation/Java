import java.util.*;
class ReverseAStringValue
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter any string value :- ");
String a=s.next();
int l=a.length();
String rev="";
for(int i=l-1;i>=0;i--)
{ 
rev=rev+a.charAt(i);
}
System.out.println(rev);
}
}
