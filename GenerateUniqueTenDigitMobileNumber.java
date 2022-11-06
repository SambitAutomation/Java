import java.util.*;

class GenerateUniqueTenDigitMobileNumber
{
  public static void main(String[] args)
  {
    Random r = new Random();
    
    int randomNumber ;
    
    String[] s = new String[10];
    
    for(int i=0; i<10; i++)
    {
      randomNumber = r.nextInt(10);
      
      s[i] = Integer.toString(randomNumber);
    }
    
    System.out.println(s[0]+s[1]+s[2]+s[3]+s[4]+s[5]+s[6]+s[7]+s[8]+s[9]);
  }
}
