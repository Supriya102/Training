
import java.util.*;
class Main
{ 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value for row:");
    int row=sc.nextInt();
    int i,j;
    int sum=5;
    int prev_sum=sum;
    int num=1;
    
    for(i=0; i<row;i++)
    {
        for(j=row-i;j>1;j--)
        {
            System.out.print(" ");
        }
        
        if(i<2)
        {
           for(j=0;j<=i;j++)
            {
                System.out.print(num+" ");
            } 
            num++;
        System.out.println();
        }
        
        else 
        {
            
            for (j=0;j<=i;j++)
            {   
              System.out.print(prev_sum+" ");
              sum=sum+prev_sum;
            }
        prev_sum=sum;        
        System.out.println("");  
        }
       
    }
    
  }
}
