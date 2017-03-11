
/* There are some errors correct them..
 *
 **/
public class MyMergeSortedArraysNoNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node head = new Node(1);
		Node tail = head.append(3).append(5).append(9).append(10);
	    Node head2 = new Node(2);
	    Node tail2 = head2.append(4).append(6).append(7).append(8);
		  
	    head.printLinkedList();head2.printLinkedList();
	    Node news = mergeTwoArrays(head, head2);
	    System.out.println("**********");
	    news.printLinkedList();
	    System.out.println("**********");
	    
	    Node head3 = new Node(1);
		Node tail3 = head3.append(3).append(8).append(9).append(10);
	    Node head4 = new Node(2);
	    Node tail4 = head4.append(4).append(6).append(7).append(11);
	    Node news2 = mergeTwoArrays(head3, head4);
	    System.out.println("**********");
	    news2.printLinkedList();
	    System.out.println("**********");
	    
	    Node head5 = new Node(2);
		//Node tail5 = head3.append(3).append(8).append(9).append(10);
	    Node head6 = new Node(3);
	    Node tail6 = head4.append(4).append(6).append(7).append(11);
	    Node news3 = mergeTwoArrays(head5, head6);
	    System.out.println("**********");
	    news3.printLinkedList();
	    System.out.println("**********");
	}
	
	static Node mergeTwoArrays(Node fst, Node scn){
		
		Node first = fst;
		Node second = scn;
		Node retur = fst;
		Node prev = fst;
		
		if(second.value<first.value){
			first = second;
			second = retur;
			retur = first;
			prev = fst;
		}
		
		Node next1,next2;
		
		for(;first.next!=null && second.next!=null;){
			next1 = first.next;
			next2 = second.next;
			//prev = first;
			
			if(second.value>first.value){
				first.next = second;
				second.next = next1;
				prev = second;
				first = next1;
				second = next2;
				
				System.out.println("First: "+first.value);
				System.out.println("SEcond: "+second.value);
				System.out.println("Prev: "+prev.value);
				System.out.println("next1: "+next1.value);
				System.out.println("next2: "+next2.value);
				System.out.println("^^^^^^");
				fst.printLinkedList();
				System.out.println();
				
				
			}
			else{
				prev.next = second;
				second.next = first;
				first = second;
				second = next2;
				/*second.next = first;
				first.next = next2;
				second = first;
				first = next1;
				*/
				System.out.println("SEcond: "+second.value);
				System.out.println("First: "+first.value);				
				System.out.println("next1: "+next1.value);
				System.out.println("next2: "+next2.value);
				System.out.println("<<<<<<<");
				fst.printLinkedList();
				System.out.println();
			}
			
		}
		
		if(first.next!=null){
			//first.next = second;
			//second = second.next;
			System.out.println("SSSSSSSSXXXSSSSSSS");
		}
		
		if(second.next!=null){
			first.next = second;
			//second = second.next;
			System.out.println("SSSSSSSSSSSSSSS");
		}
		
		return retur;
	}

}
