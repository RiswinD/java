/*
    *
   * *
  *   *
   * *
    *
*/
public class problem_23 {
    public static void main(String arg[])
    {
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=3-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                if (k==1||i==k)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
        
            System.out.println();
        }
        for (int i =2;i>=1;i--)
        {
            for (int j=1;j<=3-i;j++)
            {
                System.out.print(" ");
            }
            for  (int k=1;k<=i;k++)
            {
                if (k ==1 || k == i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }

                
            }
            System.out.println();
           
        }
        
        

    }
    
}
