
import java.util.HashMap;

public class FirstNonRepeatingChar {

	
	public static void main(String args[])
	{
		String str = "Ramya";
		char ch = findNonRepeatedChar(str);
		System.out.println("Ch: "+ch);
	}
	
	static char findNonRepeatedChar(String st)
	{
		HashMap<Character, Integer> lhs = new HashMap<Character,Integer>();
		int length = st.length();
		char charac = 0, ch;
		for(int i = 0; i< length; i++){
			ch = st.charAt(i);
			if(lhs.containsKey(ch))
			{
				lhs.put(ch, lhs.get(ch)+1);
			}
			else
				lhs.put(ch, 1);
		}
		
		for(int i = 0; i< length; i++){
			ch = st.charAt(i);
			if(lhs.get(ch)==1){
				return ch;
			}
		}
		
		return charac;
		
	}
	
}
