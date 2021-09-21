import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int n=12;
        int arr[]= new int[n];
        int i;
        
        arr[0]=0;
        arr[1]=1;
        
        for (i=2;i<n;i++)
        {
            arr[i]=arr[i-2]+arr[i-1];
        }
        
        for (i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+ " ");
        }
        
    }
}
    
