/*
1
23
456
78910
 */

public class problem_15 {
    public static void main (String arg[])
    {
        int num = 1;
        int row=4;
        for (int i=1;i<=row;i++)
        {
           for(int j=1;j<=i;j++)
           {
            System.out.print(num);
            num++;
           }
           System.out.println();

        }
    }
    
}
