import java.io.*;
class WriteDataIntoTextFile
{
public static void main(String[] args)throws Exception
{
FileWriter fw=new FileWriter("D:\\t123.txt");
BufferedWriter bw=new BufferedWriter(fw);

bw.write("We can able to write");

System.out.println("We Are completed....");

bw.close();
}
}
