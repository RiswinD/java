/*
A B C D E
A B C D
A B C
A B
A
*/
public class problem_28 {
    public static void main (String arg[])
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=6-i;j++)
            {
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
    
}
