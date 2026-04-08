/*
Print numbers from 1 to 30:

If divisible by 3 → print Fizz
If divisible by 5 → print Buzz
If divisible by both → print FizzBuzz
Otherwise → print the number
 */


public class problem_7 {
    public static void main(String args[])
    {
        for (int i=1;i<=30;i++)
        {
            if (i % 3 ==0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if ( i % 3 == 0)
            {
                System.out.println("Fizz");

            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else 
            {
                System.out.println(i);
            }
        }
    }
}
