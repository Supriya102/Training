import java.util.Scanner;
class Main
{ 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[2][3];
    System.out.println("Enter the elements :");
    for(int i=0; i<2;i++)
         {  if (i%2==0)
            { for(int j=0; j<3;j++)
                arr[i][j]=sc.nextInt();
            }
            else
            {
             for(int j=2; j>=0;j--)
                arr[i][j]=sc.nextInt();   
            }
         }
         System.out.println("Matrix :");
    for(int[] key: arr)
    {
       for(int val : key)
       {
          System.out.print(val +" ");
       }
     System.out.println();
  }
}
}
