/*
Print all prime numbers from 1 to 50.
*/
public class problem_32 {
    public static void main (String arg[])
    {
        for (int i=2;i<=50;i++)
        {
            boolean prime =true;
            for (int j=2;j<i;j++)
            {
                if (i % j == 0)
                {
                    prime =false;
                }
            }
            if (prime)
            {
                System.out.print(i+" ");
            }
           
        }
    }
    
}
