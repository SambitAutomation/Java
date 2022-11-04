class CountNumberOfDigits_even_odd
{
public static void main(String[] args)
{
int num=23962;
		int Evencount=0;
		int Oddcount=0;
		int rem;
		   while(num>0) 
		       {
		            rem=num%10;
		                         if(rem%2 == 0)
		                             {
		                                  Evencount=Evencount+1;
		                                  
		                             }
		                         else
		                          {
		                                Oddcount=Oddcount+1;
		                            	
		                           }
		                         num=num/10;
		        
		       }
		   System.out.println("Evencount of this provided number is :- "+ Evencount);
		   System.out.println("Oddcount of this provided number is :- "+ Oddcount);
}
} 
