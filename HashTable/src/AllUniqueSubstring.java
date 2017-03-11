
import java.util.HashMap;
import java.util.HashSet;

public class AllUniqueSubstring
{
 public static void main(String[] args)
 {
  String input = "abacbdadbc";
  printAllUniqueSubstring(input);
 }

 public static void printAllUniqueSubstring(String input)
 {
  HashSet<Character> set = new HashSet<Character>();
  int startIndex = 0;
  int endIndex = 0;
  int maxLength = 0;
  int startMax = 0;
  int endMax = 0;

  while (endIndex < input.length())
  {
   char addChar = input.charAt(endIndex);
   if (!set.contains(addChar))
   {
    set.add(addChar);
    int currentLength = endIndex - startIndex + 1;
    System.out.println("Curr Len: "+ currentLength+" endI: "+endIndex+" Start: "+startIndex);
    if (currentLength > maxLength)
    {
     maxLength = currentLength;
     startMax = startIndex;
     endMax = endIndex;
    }
    endIndex++;
   } else
   {
    char removeChar = input.charAt(startIndex);
    System.out.println("rem: "+removeChar+" srtidx: "+startIndex +" endidx: "+endIndex+" addC: "+addChar+" Size: "+set.size());
    
    /* We are not removing the duplicate, we are removing
	 * the element at startIndex; So thereby we increase the 
	 * startindex but we won't be changing the start max 
	 * and end max. as CL< ML. IMP 
	 */
    
    set.remove(removeChar);
    startIndex++;
    
    if (removeChar == addChar)
    {
     set.add(removeChar);//we are removing the prev occurence and adding the present occurence
     System.out.println("add char is: "+addChar);
     int currentLength = endIndex - startIndex + 1;
     if (currentLength > maxLength)
     {
      maxLength = currentLength;
      startMax = startIndex;
      endMax = endIndex;
     }
     endIndex++;
    }
    System.out.println("SetSize: "+set.size());
   }
  }
  System.out.println("SetSize Final: "+set.size());
  System.out.println(startMax + "," + endMax);
  System.out.println(input.substring(startMax, endMax+1));
 }

}