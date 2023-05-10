
class NumberToStringConversion {
    public static void main(String[] args) {
        
        String abc = "989123";
        String words[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0;i<abc.length();i++)
        {
            int digit = Character.getNumericValue(abc.charAt(i));
            
            System.out.println(words[digit]);
        }
        
    }
}

---------------------------------------------------------------------------------------------------------------------
    Using Switch statement
    =======================
    
    class NumberToStringConversion {
     public static void main(String[] args) {
        
        String a = "92823";
        
        for(int i=0;i<a.length();i++)
        {
            switch(a.charAt(i))
            {
                case '0':
                    System.out.println("zero");
                    break;
                    
                case '1':
                    System.out.println("one");
                    break;
                    
                case '2':
                    System.out.println("two");
                    break; 
                    
                case '3':
                    System.out.println("three");
                    break;
                    
                case '4':
                    System.out.println("four");
                    break;
                    
                case '5':
                    System.out.println("five");
                    break; 
                    
                 case '6':
                    System.out.println("six");
                    break;
                    
                case '7':
                    System.out.println("seven");
                    break; 
                    
                case '8':
                    System.out.println("eight");
                    break;
                    
                case '9':
                    System.out.println("nine");
                    break;
                    
               
            }
        }
        
    }
}
