
public class ReverseLinkedListRecursive
{
    static int rk = 0;
	
 public static void main(String[] args)
 {
  
  Node a=new Node(4);
  Node b=new Node(6);
  Node c=new Node(2);
  Node d=new Node(9);
  Node e=new Node(5);
  Node f=new Node(3);
  Node g=new Node(6);
  Node h=new Node(2);
  a.next=b;
  b.next=c;
  c.next=d;
  d.next=e;
  e.next=f;
  f.next=g;
  g.next=h;
  a.printLinkedList();
  Node head=reverseLinkedList(a,a);
  head.printLinkedList();
 }
 public static Node reverseLinkedList(Node head, Node a)
 {
  if(head.next==null){
	  System.out.println("Head: "+head.value);
	  return head;
  }
   
  Node newHead=reverseLinkedList(head.next,a);
  rk++;
  System.out.println("RK: "+rk +"  Head: "+head.value);
  
  head.next.next=head;//Normally 6->2 Now 6.next.next = 6->2-> = 6 and  
  head.next=null;// 6->2 is removed so it will look like 2->6 
                         // Total list 4->6... 3->6<-2
  System.out.println("New Head: "+newHead.value);
  System.out.println();
  
  return newHead;
 }
 
 static class Node
 {
  public Node next;
  public int value;

  public Node(int value)
  {
   this.value = value;
  }
  public void printLinkedList()
  {
   Node head=this;
   while (head != null)
   {
    System.out.print(head.value + "->");
    head = head.next;
   }
   System.out.println();
  }

 }
}