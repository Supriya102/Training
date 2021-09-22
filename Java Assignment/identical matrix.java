import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int n=2, i, j;
    Scanner sc = new Scanner(System.in);

    int matrix1[][] = new int[n][n];
    int matrix2[][] = new int[n][n];
    int temp[][] = new int[n][n];
    int flag=1;

    System.out.println("Enter the elements of first matrix :");
    for (i = 0; i < n; i++)
    {
      for (j= 0; j < n; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }

    System.out.println("Enter the elements of second matrix :");

    for (i = 0; i < n; i++)
    {
      for (j= 0; j < n; j++)
      {
        matrix2[i][j] = sc.nextInt();
      }
    }
    
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            for (int c = 0; c < n; c++) 

                        {
                            if(matrix1[i][j] != matrix2[i][j])
                            {
                            temp[i][j] = matrix1[i][j];
                            flag=0;
                            }
                        }
        }
    }
    
    if(flag==1)
    {
        System.out.println("Identical matrices");
    }
    else
    {
        System.out.println("Not identical");
        for ( i = 0; i < n; i++)
        {
        for ( j = 0; j < n; j++)
            {
            
            System.out.print(temp[i][j] + " ");

            }
            System.out.println();
        }
        
    }
   
}
}
