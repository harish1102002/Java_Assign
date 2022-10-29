import java.util.*;
class arrayimple implements stack
{
  int n,stack[],top=0;

  public void setter(int x)
  {
    this.n=x;
    this.stack= new int[n];
  }

  public void push(int i)
  {
    if(this.top<this.n)
    {
      this.stack[this.top]=i;
      this.top++;
    }
    else
    System.out.println("\nStack Overflow!!!\n");
  }


  public void pop()
  {
    if(this.top>0)
    this.top--;
    else
    System.out.println("\nStack Empty!!!\n");
  }

  public void print()
  {
    if(this.top==0)
    {
      System.out.println("\nStack Empty!!!\n");  
      return;
    }
    System.out.println();
    for(int i=this.top-1;i>-1;i--)
    System.out.print(this.stack[i]+" -> ");
    System.out.println();
    System.out.println();
  }

  public void topele()
  {
    if(this.top==0)
    {
      System.out.println("\nStack Empty!!!\n");
      return;
    }
      System.out.println("\n"+this.stack[this.top-1]);
      System.out.println();
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x;
    System.out.println("Enter the maximum no of elements in the stack: ");
    x=sc.nextInt();
    arrayimple a=new arrayimple();
    a.setter(x);
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