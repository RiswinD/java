/*
Write a program to check if a number is prime or not.
*/
public class problem_31 {
    public static void main (String arg[])
    {
        int n =8;
        boolean prime =true;
        for (int i=2;i<n;i++)
        {
            if (n % i == 0)
            {
               prime =false; 
            }

        }
        if (prime)
        {
            System.out.println("Prime");
        }
        else 
        {
            System.out.println("not prime");
        }
    }
    
}
