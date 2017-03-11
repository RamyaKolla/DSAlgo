
public class MyKthElementfromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head1 = new Node(1);
		Node middle1 = head1.append(2).append(3).append(4);
		middle1.append(6).append(7).append(8).append(9);

		Node element = kthElement(head1,2);
		System.out.println("Element: "+element.value);
	}
	
	public static Node kthElement(Node head, int k){
		
		Node save = head;
		
		for(int i=0;i<k;i++){
			head = head.next;
		}
		
		System.out.println(head.value);
		while(head.next!=null){
			save = save.next;
			head = head.next;
		}
		
		System.out.println("Save: "+save.value);
		
		return save;
	}
	
}
