import java.util.*;

class DuplicateCharacterFromString
{
public static void main(String[] args)
{
String s = "teastaing";

char[] ch = s.toCharArray();

for(int i=0; i<s.length(); i++)
{
  for(int j = i+1; j<s.length(); j++)
 {
       if(ch[i] == ch[j])
                  {
                                  System.out.println(ch[j]);
}
}
}
} 
}
