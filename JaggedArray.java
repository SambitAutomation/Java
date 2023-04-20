import java.util.*;
class JaggedArray {
    public static void main(String[] args) {
        
        int[][] num = new int[3][];
        
        num[0] = new int[4];
        num[1] = new int[1];
        num[2] = new int[6];
        
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                num[i][j] = (int)(Math.random()*100);
            }
        }
        
        for(int m[] : num)
        {
            for(int n : m)
            {
                System.out.print(n + "  ");
            }
             System.out.println();
        }
       
    }
}
