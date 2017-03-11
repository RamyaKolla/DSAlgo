
import java.util.*;
 
public class StringPermutation {
	
	public static  void main(String[] args) {
        String s = "CODE";
    ArrayList<String> value = PermutationFinder(s);
    System.out.println("\nThe Permutations are : \n" + value);
    }
	
	public static ArrayList<String> PermutationFinder(String s) {
    ArrayList<String> perm = new ArrayList<String>();
    if (s == null) { // error case
        return null;
    } else if (s.length() == 0) 
    { 
        perm.add(""); // initial 
        return perm;
    }   
    char initial = s.charAt(0); // first character
    System.out.println("Char 0 : "+ initial);
    String rem = s.substring(1); // Full string without first character
    ArrayList<String> words = PermutationFinder(rem);
    System.out.println("WORDS:" + words);
    for (String str : words) 
    {
        for (int i = 0; i <= str.length(); i++) 
        {
        	System.out.println(".. "+str+" ..Before: "+ str.length()+"..."+initial+".."+i);
        	perm.add(charinsert(str, initial, i));            
        }
    }   
    return perm;
    }
    
	public static String charinsert(String str, char c, int j) {
    String begin = str.substring(0, j);
    
    String end = str.substring(j);
    System.out.println("begin: "+ begin);
    System.out.println("end: "+ end);
    System.out.println("After: "+ begin+c+end);
    return begin + c + end;
    }
    
}