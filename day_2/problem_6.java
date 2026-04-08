//Print all numbers from 1 to 50 that are divisible by 3 but not by 6.
public class problem_6 {
    public static void main(String arg[])
    {
        for (int i=1;i<=50;i++)
        {
            if (i % 3 == 0 && i % 6 != 0)
            {
                System.out.println(i);
            }
        }
    }
    
}
