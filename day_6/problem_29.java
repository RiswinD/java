/*
A
BB
CCC
DDDD
EEEEE
*/
public class problem_29 {
    public static void main (String args[])
    {
        
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                
                System.out.print((char)('A'+i-1));
               

            }
            System.out.println();
        }
    }
    
}
