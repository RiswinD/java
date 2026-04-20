/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/
public class problem_30 {
    public static void main (String arg[])
    {
         for (int i=1;i<=5;i++)
    {
        for (int j =4;j>=i;j--)
        {
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++)
        {
            System.out.print((char)('A'+j-1));
        }
        for (int j=i-1;j>=1;j--)
        {
            System.out.print((char)('A'+j-1));
        }
        System.out.println();
    }
    
    }
   
}
