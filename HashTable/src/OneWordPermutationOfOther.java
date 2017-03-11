import java.util.HashMap;
import java.util.Map;

public class OneWordPermutationOfOther
{
 public static void main(String[] args)
 {
  String a = "listenaa";
  String b = "enlaista";
  System.out.println(isPermutation(a, b));
 }

 private static boolean isPermutation(String a, String b)
 {
  Map < Character, Integer> charMap = new HashMap < Character, Integer>();
  for (char ch : a.toCharArray())
  {
   if (charMap.containsKey(ch))
    charMap.put(ch, charMap.get(ch) + 1);//increase the number of occurences
   else
    charMap.put(ch, 1);
  }
  for (char ch : b.toCharArray())
  {
   if (!charMap.containsKey(ch))//if the curr char is not available, return false
    return false;
   if (charMap.get(ch) == 1)
    charMap.remove(ch);
   else
    {
	   System.out.println("get char: "+charMap.get(ch));
	   charMap.put(ch, charMap.get(ch) - 1); //decrease the occurences
	   System.out.println("get char: "+charMap.get(ch));
    }
  }
  if (charMap.keySet().size() == 0)
   return true;
  return false;
 }

}
