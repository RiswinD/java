/*
E
DE
CDE
BCDE
ABCDE
*/
public class problem_27 {
    public static void main(String arg[])
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=6-i;j<=5;j++)
            {
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
    
}
