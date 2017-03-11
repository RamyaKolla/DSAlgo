import java.util.StringTokenizer;
import java.util.Stack;

public class ReverseWordsofString {

	public static void main(String[] args) {

		ReverseWordsofString rev = new ReverseWordsofString();
		String strin = rev.reverseString("This is my test case");
		System.out.println(strin);
	}

	String reverseString(String str){
		
		StringBuffer reverse = new StringBuffer("");
		int i = 0;
		Stack<String> st = new Stack<String>();
		
		StringTokenizer strTok = new StringTokenizer(str);
		int count = strTok.countTokens();
		
		while(strTok.hasMoreTokens()){
			st.push(strTok.nextToken());
		}
		//System.out.println("Reverse: "+reverse);
		
		for(i=0; i<count;i++)
		{
			reverse.append(st.pop());
			reverse.append(" ");
			System.out.println("Reverse: "+reverse);
		}
		
		System.out.println("Reverse: "+reverse);
		/*while((lastIndex = str1.lastIndexOf(" "))!=0){			
			String subStr = str1.substring(lastIndex);
			reverse = reverse.append(subStr); 
			str1 = str.substring(0,lastIndex);
			System.out.println("Reverse: " +reverse);
		}*/
		
		return reverse.toString();
	}
}
