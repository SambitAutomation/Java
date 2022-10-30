class ReverseWordsInAString
{
    public static void main(String[] args)
    {
        String s = "Java Program";
        
        String[] words = s.split(" ");
        String revString = "";
        
        for(int i=0; i<words.length; i++)
        {
            String word = words[i];
            String revWords = "";
            
            for(int j = word.length()-1; j>=0; j--)
            {
                revWords = revWords + word.charAt(j);
            }
            
            revString = revString + revWords + " ";
        }
        
        System.out.println(revString);
    }
}
