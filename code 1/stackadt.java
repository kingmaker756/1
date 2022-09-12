import java.io.*;
//import java.lang.*;
class Node
{
    int data;       
    Node next;      
}
 
class Stack
{
    private Node top;
 
    public Stack() 
    {
        this.top = null;
    }
 
    public void push(int x)        
    {
        Node node = new Node();
        System.out.println("Inserting " + x); 
        node.data = x;
        node.next = top;
        top = node;
    }
 








   public int peek()
    {
        if (top!=null) {
            return top.data;
        }
        else {
            System.out.println("The stack is empty");
            return -1;
        }
    }
 
    public void pop()       
    {
        if (top == null)
        {
            System.out.print("\nStack Underflow");
            return;
        }
        System.out.println("Removing " + peek());
        top = (top).next;
    }

 void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow\n");
           System.exit(1);
        }
        else {
            Node node = top;
            while (node != null) { 
                System.out.printf("%d->", node.data);
         node = node.next;
            }
        }
    }
}




class stackadt
{
    public static void main(String[] args)throws IOException
    {
        Stack stack = new Stack();
        int ch,s;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      do
         { 
      System.out.println("\nEnter your choice:\n\t1.PUSH \n\t2.POP \n\t3.DISPLAY \n\t4.EXIT");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
{
case 1:
   System.out.println("Enter the item to be inserted:");     
   s=Integer.parseInt(br.readLine());
   stack.push(s);
             System.out.println("The top element is " + stack.peek());
             break;
       case 2:
        		  stack.pop();
            break;
      case 3:
stack.display();
break;
          }
    }  while(ch!=4);
    }

 
    
}
