// Given n = 15, print all its factors.
// Factors of 15 → 1 3 5 15
public class problem_9 {
    public static void main (String arg [])
    {
        int n = 15;
        for (int i=1;i<=n;i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
            }
        }
    }
    
}
