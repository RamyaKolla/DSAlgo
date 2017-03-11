
public class LinkedListKthElementFromEnd
{
 public static void main(String[] args)
 {
  Node head = new Node(1);
  head.append(2).append(3).append(4).append(5).append(6).append(7)
    .append(8).append(9);
  Node result = findKFromEnd(head, 3);
  System.out.println(result.value);
 }

 private static Node findKFromEnd(Node head, int k)
 {
  Node ahead = head;
  while (k-- > 0)
  {
   System.out.println("k: " +k);
   ahead = ahead.next;
  } // ahead will now be pointing 4 and head 1.
  
  while (ahead != null) // when ahead is at null, head will be at 7.
  {
	  System.out.println("Ahead: " +ahead.value);
	  head = head.next;
	  ahead = ahead.next;
  }
  return head;
 }

 private static class Node
 {
  public Node next;
  public int value;

  public Node(int value)
  {
   this.value = value;
  }

  public Node append(int value)
  {
   Node node = new Node(value);
   next = node;
   return node;
  }
 }

}