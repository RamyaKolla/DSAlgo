
public class NextPowerOfTwo
{
 public static void main(String[] args)
 {
  long num = 120;
  long result = findNextPowerOfTwo(num);
  System.out.println("Next highest power: "+result);
  //System.out.println("Next Lowest power: "+(result>>1));
 }

 private static long findNextPowerOfTwo(long num)
 {
  long result = 1;
  while (num != 0)
  {
   num >>= 1;
   result <<= 1;
   System.out.println("num: "+num+" result: "+result);
  }
  return result;
 }
}