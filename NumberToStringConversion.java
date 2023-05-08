
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
