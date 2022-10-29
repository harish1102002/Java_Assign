import java.util.*;
class listimple {
    private class Node {
        int data;
        Node link;
    }
    
    Node top;
    
    listimple() { this.top = null; }
 
    public void push(int x)
    {
        Node temp = new Node();
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty() { return top == null; }

    public void topele()
    {
        if (!isEmpty())
            System.out.println("/n"+top.data+"/n");
        else {
            System.out.println("\nStack is empty\n");
            return;
        }
    }

    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow\n");
            return;
        }
        top = (top).link;
    }
 
    public void print()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow\n");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.link;
                if(temp != null)
                    System.out.print(" -> ");
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x;
    listimple a=new listimple();
    while(true){
    System.out.println("1.push\n2.pop\n3.print\n4.topele\n5.Exit\n\nEnter Your choice: ");
    x=sc.nextInt();
    switch (x) {
      case 1:
      System.out.println("Enter the input : ");
      a.push(sc.nextInt());
        break;
      case 2:
      a.pop();
      break;
      case 3:
      a.print();
      break;
      case 4:
      a.topele();
      break;
      case 5:
      sc.close();
      System.exit(0);
      break;
      default:
        break;
    }
    }
}
}