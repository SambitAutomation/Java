import java.io.*;
import java.util.*;
class ReadDataFromTextFile
{
public static void main(String[] args)throws Exception
{
File f=new File("D:\\t123.txt");
Scanner sc=new Scanner(f); 

while(sc.hasNextLine())
{
System.out.println(sc.nextLine());
}

}
} 
