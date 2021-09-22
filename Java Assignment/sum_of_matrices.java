import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int row, col, i, j;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows : ");
    row = sc.nextInt();
    System.out.println("Enter the number of columns : ");
    col = sc.nextInt();

    int first[][] = new int[row][col];
    int second[][] = new int[row][col];
    int sum[][] = new int[row][col];

    System.out.println("Enter the elements of first matrix :");
    for (i = 0; i < row; i++)
    {
      for (j= 0; j < col; j++)
      {
        first[i][j] = sc.nextInt();
      }
    }

    System.out.println("Enter the elements of second matrix :");

    for (i = 0; i < row; i++)
    {
      for (j= 0; j < col; j++)
      {
        second[i][j] = sc.nextInt();
      }
    }
    
    System.out.println("Sum of the matrices:");

    for (i = 0; i < row; i++)
    {
      for (j= 0; j < col; j++)
      {
        sum[i][j] = first[i][j] + second[i][j]; 
      }
    }

    System.out.println("Result :");

    for (i = 0; i < row; i++)
    {
      for (j= 0; j < col; j++)
      {
        System.out.print(sum[i][j] + "\t");
      }
      System.out.println();
    }
}
}
