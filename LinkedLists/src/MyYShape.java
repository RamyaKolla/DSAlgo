
public class MyYShape {

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		f.next = c;
		
		Node news = findJunction(a,f); 	
		System.out.println(" Node: "+news.value);
	}
	
	static Node findJunction(Node a, Node b){
		
		Node one = a;
		Node two = b;
		
		int count1 = 1, count2 = 1;
		
		while(a.next!=null)
		{
			count1++;
			a = a.next;
		}
		while(b.next!=null)
		{
			count2++;
			b = b.next;
		}
		 
		int diff = 0;
		
		if(count2>count1){
			diff = count2 - count1;
			for(int i=0; i<diff;i++){
				two = two.next;		
			}
		}
		else{
			diff = count1 - count2;
			for(int i=0; i<diff;i++){
				one = one.next;		
			}
		}
			
		while(one.next != two.next){
			one = one.next;	
			one = one.next;	
		}
		
		if(one.next == null || two.next == null)
		{
			return null;
		}
		else
			return one.next;
			
				
	}

	static class Node{
		int value;
		Node next;
		Node(int n){
			value = n;
		}
	}
}
