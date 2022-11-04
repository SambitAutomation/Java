class printEvenAndOddNumbersFromAnArray
{
public static void main(String[] args) 
{
 int[] a={2,1,5,3,8,3};
  
   for(int data:a)
        {
           if(data%2==0)
                 {
                     System.out.println("Even Numbers :- " + data);
                 }
         }

   for(int data:a)
        {
           if(data%2!=0)
                 {
                     System.out.println("Odd Numbers :- " + data);
                 }
         }

}
}
