
public class Node{
	int value;
	Node next;
	
	Node(int n){
		value = n;
	}
	
	Node append(int n){
		Node news = new Node(n);
		Node now = this;
		now.next = news;
		return news;
	}
	
	public void printLinkedList()
	{
		Node head = this;
		while (head != null)
	    {
			System.out.print(head.value + "->");
			head = head.next;
		}
	    System.out.println();
	 }
}