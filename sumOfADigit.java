class sumOfADigit
{
public static void main(String[] args)
{
int num=1022;
int sum=0, c;
while(num>0)
{
     c=num%10;
     sum=sum+c;
     num=num/10;
}
System.out.println(sum);
}
}