class CountNumberOfDigits
{
public static void main(String[] args)
{
int num=23;
int count=0;
 
   while(num>0) 
       {
            num=num/10;
            count=count+1;
       }

System.out.println("Count of this provided number is :- "+ count);
}
}