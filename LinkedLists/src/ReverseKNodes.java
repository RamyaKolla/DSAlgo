
public class ReverseKNodes
{
 public static void main(String[] args)
 {
  int[] arr =
  { 1,2,3,4,5};
  Node head = createLinkedList(arr);
  printLinkedList(head);
  head = reverse(head, 4);
  printLinkedList(head);
 }

 static Node reverse(Node head, int k)
 {
  Node current = head;
  Node next = null;
  Node prev = null;
  int count = 0;

  while (current != null && count < k)
  {
  // System.out.println("1next: "+next.value+"  Current.next: "+current.next.value+" prev: "+prev.value+"  Current: "+current.value);
   next = current.next;
  // System.out.println("2next: "+next.value+"  Current.next: "+current.next.value+" prev: "+prev.value+"  Current: "+current.value);
   current.next = prev;
  // System.out.println("3next: "+next.value+"  Current.next: "+current.next.value+" prev: "+prev.value+"  Current: "+current.value);
   prev = current;
  // System.out.println("4next: "+next.value+"  Current.next: "+current.next.value+" prev: "+prev.value+"  Current: "+current.value);
   current = next;
   //System.out.println("5next: "+next.value+"  Current.next: "+current.next.value+" prev: "+prev.value+"  Current: "+current.value);
   count++;
   
   System.out.println();
  }

  if (next != null)
  {
   head.next = reverse(next, k);
  }
  return prev;
 }

 private static void printLinkedList(Node head)
 {
  while (head != null)
  {
   System.out.print(head.value + "->");
   head = head.next;
  }
  System.out.println();
 }

 private static Node createLinkedList(int[] arr)
 {
  Node head = null;
  Node current = null;
  for (int element : arr)
  {
   if (head == null)
   {
    head = new Node(element);
    current = head;
   } else
   {
    current.next = new Node(element);
    current = current.next;
   }
  }
  return head;
 }

 static class Node
 {
  public Node next;
  public int value;

  public Node(int value)
  {
   this.value = value;
  }
 }

}