
import java.util.HashSet;
import java.util.Set;

public class dictionaryWordBreaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> Dictionary = new HashSet<String>();
		Dictionary.add("Leet");
		Dictionary.add("code");
		Dictionary.add("cod");
		Dictionary.add("Date");
		Boolean dict = wordBreak("LeetcodeDate",Dictionary);
		System.out.println("dict "+dict);

	}


		public static boolean wordBreak ( String s , Set <String > dict ) {
		boolean [ ] t = new boolean [s.length()+1] ;
		t [ 0 ] = true ; 
		// s e t f i r s t t o b e t rue , why?
		// Be c aus e we ne ed i n i t i a l s t a t e
		for(int i =0; i <s.length(); i++){
		// s h oul d c o n t i n u e from match p o s i t i o n
		if ( ! t [ i ] )
		continue ;
		for ( String a : dict ) {
			int len = a.length ( ) ;
			int end = i + len ;
			if ( end > s.length ( ) )
				continue ;
			if ( s.substring( i , end ) . equals ( a ) ) {
				t [ end ] = true ;
			}
		}
		}
		int i = 0;
		for(boolean x : t){
			System.out.println("t["+i+"] = "+ x);
			i++;
		}
		return t[s.length()] ;
		}

}
