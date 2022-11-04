class SumOfArrayElements
{
public static void main(String[] args)
{
int[] a={2,4,5,6,10};
int sum=0;

/*for(int i=0; i<=a.length-1; i++)
{ 
sum=sum+a[i];
}*/

for(int value:a)
{
sum=sum+value;
}

System.out.println(sum);
}
}
