import java.util.*;
class CreationOf2DArrayWithRandomNumber {
    public static void main(String[] args) {
        
        int[][] num = new int[3][4];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
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
