public class Main 
{    
    class Node
    {    
        int data;    
        Node next;    
            
        public Node(int data) 
        {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    public Node head = null;    
    public Node tail = null;    
        
    //Adding at the end
    public void add(int data) 
    {    
        Node newNode = new Node(data);    
            
        if(head == null) 
        {    
    
            head = newNode;    
            tail = newNode;    
        }    
        else 
        {    
               
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
    
    //removing from the end
    public void remove() 
    {
        if(head == null) 
        {  
            System.out.println("Linked list is empty");  
            return;  
        }  
        else 
        {  
            if(head != tail ) 
            {  
                Node current = head;  
                while(current.next != tail) 
                {  
                    current = current.next;  
                }  
                tail = current;  
                tail.next = null;  
            }  
            
            else 
            {  
                head = tail = null;  
            }  
        }  
    }
        
    public void display() 
    {    
        Node current = head;    
            
        if(head == null) 
        {    
            System.out.println("Linked list is empty.");    
            return;    
        }    
        System.out.println("linked list: ");    
        while(current != null) 
        {    
            System.out.print(current.data); 
            if(current.next!=null)
            {
                System.out.print("-->");
            }
            current = current.next;    
        }    
        System.out.println();    
    } 
    
    public int listLength(Node head)
    {
        Node current = head;
        int c = 0;
        while (current != null)
        {
            c++;
            current = current.next;
        }
        return c;
    }
 
    
    public void toArray(Node head)
    {
        int len = listLength(head);
        int []arr = new int[len];
        int index = 0;
        Node current = head;
 
       while (current != null)
        {
            arr[index++] = current.data;
            current = current.next;
        }
 
        printArray(arr, len);
    }
    
    public void printArray(int a[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
        
    public static void main(String[] args) {    
            
        Main obj = new Main();    
        obj.add(1);    
        obj.add(2);
        obj.add(3);
        obj.add(4);    
            
        obj.display();   
        System.out.println("\nAfter removing from the end -");
        obj.remove();
        obj.display();
        System.out.println("\nArray is :");
        obj.toArray(obj.head);
    }    
}    
