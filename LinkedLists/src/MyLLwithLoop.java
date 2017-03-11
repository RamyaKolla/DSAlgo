
//import MyKthElementfromEnd;

public class MyLLwithLoop {

	public static void main(String[] args) {
		Node head = new Node(1);
		  Node middle = head.append(2).append(3).append(4).append(5);
		  Node tail = middle.append(6).append(7).append(8).append(9).append(10)
		    .append(11);
		  tail.next = middle;
		  Node junction = findLoop(head);
		  System.out.println("Junction : "+junction.value);
	}

	static Node findLoop(Node head){
		
		Node slowptr = head;
		Node fastptr = head;
		boolean isLoop = false;
		int countLength = 0;
		
		while(fastptr.next != null){
			slowptr = slowptr.next;
			fastptr = fastptr.next;
			
			if(fastptr.next != null){
				fastptr = fastptr.next;
			}
			
			if(slowptr==fastptr){
				isLoop = true;
				System.out.println("isLoop: "+isLoop);
				break;
			}
		}
		
		do{
			fastptr= fastptr.next;
			countLength++;
			System.out.println("countLength: "+countLength);
		}while(slowptr!=fastptr);
			
		
		slowptr = head;
		fastptr = head;
		
		System.out.println("countLength: "+countLength);
		System.out.println("Head: "+head.value);
		
		//Node news = MyKthElementfromEnd.kthElement(head, countLength); 
		//It didn't work as the their is loop here an it was struck in while loop
		
		for(int i=0;i<countLength;i++){
			fastptr = fastptr.next;
		}
		
		while(slowptr!=fastptr){
			slowptr = slowptr.next;
			fastptr = fastptr.next;
		}
		
		//System.out.println(" slowptr: "+slowptr.value);
		
		return slowptr;
		
	}
	
}
