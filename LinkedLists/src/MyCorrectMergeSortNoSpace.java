
public class MyCorrectMergeSortNoSpace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node head = new Node(1);
		Node tail = head.append(3).append(5).append(9).append(10);
	    Node head2 = new Node(2);
	    Node tail2 = head2.append(4).append(6).append(7).append(8);
		  
	    head.printLinkedList();head2.printLinkedList();
	    Node news = mergeTwoLL(head, head2);
	    System.out.println("**********");
	    news.printLinkedList();
	    System.out.println("**********");
	    
	    Node head3 = new Node(1);
		Node tail3 = head3.append(3).append(8).append(9).append(10);
	    Node head4 = new Node(2);
	    Node tail4 = head4.append(4).append(6).append(7).append(11);
	    Node news2 = mergeTwoLL(head3, head4);
	    System.out.println("**********");
	    news2.printLinkedList();
	    System.out.println("**********");
	    
	    Node head5 = new Node(2);
		Node tail5 = head3.append(3);
	    Node head6 = new Node(1);
	    Node tail6 = head4.append(4).append(6).append(7).append(11);
	    Node news3 = mergeTwoLL(head5, head6);
	    System.out.println("**********");
	    news3.printLinkedList();
	    System.out.println("**********");
	}
	
	static Node mergeTwoLL(Node fst, Node scn){
		
		Node temp;
		Node head = null,tail = null;
		
		while(fst.next!=null && scn.next!=null){
			if(fst.value<scn.value){
				temp = fst;
				fst = fst.next;
			}
			else{
				temp = scn;
				scn = scn.next;
			}
			
			if(head == null){
				head = temp;
				tail = temp;
			}
			else{
				tail.next = temp;
				tail = temp;
			}
		}
		
		if(fst.next == null && scn.next == null)
			tail.next = null;
		else if(fst.next == null)
			tail.next = scn;
		else
			tail.next = fst;
		
		return head;
		}
		
	}

