public class MaxSubarrayEqualOnesZeros
{
 public static void main(String[] args)
 {
  int[] arr =
  { 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1,
    0, 1, 1, 0, 1, 0, 0, 0 };
  printMaxSubarray(arr);
 }

 private static void printMaxSubarray(int[] arr)
 {
  Integer[] diffMap = new Integer[arr.length * 2 + 1];
  diffMap[arr.length] = -1;
  int sum = 0;
  int maxLength = 0;
  int maxStart = -1;
  int maxEnd = -1;
  for (int i = 0; i < arr.length; ++i)
  {
   if (arr[i] == 0)
    sum -= 1;
   else
    sum += 1;
   
   System.out.println("Sum: "+sum);
   Integer prevIndex = diffMap[arr.length + sum];
   if (prevIndex == null)
   {
	   System.out.println("NoPrev : "+(arr.length+sum)+"  i "+i);
	   diffMap[arr.length + sum] = i;
   }
   else
   {
    if (i - prevIndex > maxLength)// changes only if the diff is more than max
    {
    	/*System.out.println("i-prev > mx : "+(i-prevIndex));
    	System.out.println("maxLength: "+maxLength);
    	System.out.println("maxStart: "+maxStart);
    	System.out.println("maxEnd : "+maxEnd);*/
    	
    	maxLength = i - prevIndex;//now this will be max length
    	maxStart = prevIndex + 1; //the current sum occured previously at prevIndex so before that. 
    	maxEnd = i;
    	
    	/*System.out.println("maxLength: "+maxLength);
    	System.out.println("maxStart: "+maxStart);
    	System.out.println("maxEnd : "+maxEnd);*/
    }
   }
  }
  System.out.println("indices (" + maxStart + "," + maxEnd + ")");
  System.out.println("length=" + maxLength);
 }
}