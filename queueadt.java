import java.io.*;
//import java.lang.*;
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
 
class Queue
{
    private static Node rear = null, front = null;
     public static int dequeue()    
    {
        if (front == null)
        {
            System.out.print("\nQueue Underflow");
            System.exit(1);
        }
         Node temp = front;
        System.out.printf("Removing %d\n", temp.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        int item = temp.data;
        return item;
    }
 


   public void enqueue(int item)     
    {
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);
        if (front == null)
        {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
    }
 
    public int peek()
    {
           if (front != null) {
            return front.data;
        }
        else {
            System.exit(1);
        }
         return -1;
    }
 
     public static boolean isEmpty() {
        return rear == null && front == null;
    }

    static void displayQueue(Queue q){
        Node temp = q.front;
        System.out.printf("\nElements in Circular Queue are: ");
        while (temp.next != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d", temp.data);
    }
}
 
class queueadt
{
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)throws IOException
    {
       Queue q = new Queue();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int ch,s;
      do
     {
           System.out.println("\nEnter your choice:\n\t1.Enqueue\n\t2.Dequeue\n\t3.Display");
System.out.println("\nEnter your chice:");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
   case 1:
System.out.println("Enter the element for queue:");
s=Integer.parseInt(br.readLine());      
q.enqueue(s);
         System.out.printf("The front element is %d\n", q.peek());
         break;
case 2:
        q.dequeue();
         break;
case 3:
q.displayQueue(q);
break;
}
}while(ch!=4); 
  }
}
