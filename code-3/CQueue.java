//import java.util.*;
import java.io.*;  
class CQueue {
    static class Node {
        int data;
        Node link;
    }
  
    static class Queue {
        Node front, rear;
    }
 
  void enQueue(Queue q, int value)
    {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else
            q.rear.link = temp;
  
        q.rear = temp;
        q.rear.link = q.front;
    }
  
 
   void deQueue(Queue q)
    {
        if (q.front == null) {
            System.out.printf("Queue is empty");
        }
  
        int value; // Value to be dequeued
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }
        else 
        {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        } 
        System.out.println("The Dequeue element is:"+value); 
    }
  
    void displayQueue(Queue q)
    {
        Node temp = q.front;
        System.out.printf("\nElements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
  
  
/**
 * @param args
 * @throws IOException
 */

public static void main(String args[])throws IOException
    {
  
      Queue q = new Queue();
        q.front = q.rear = null;
       CQueue c=new CQueue();  
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
c.enQueue(q,s);
         break;
case 2:
        c.deQueue(q);
       break;
case 3:
c.displayQueue(q);
break;
}
}while(ch!=4); 
  }
}

