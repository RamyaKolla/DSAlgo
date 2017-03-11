
public class NumberOfOnes
{

 /**
  * given n find the total number of ones in the binary representation of
  * numbers 1,2,3,...,n
  * 
  * @param args
  */
 public static void main(String[] args)
 {
  System.out.println(getNumberOfOnes(11));
 }

 public static int getNumberOfOnes(int num)
 {
  int p = 1, cnt = 0;

  if ((num & 1) != 0){ // to find if it is an odd number
	  System.out.println("num & 1: "+(num & 1));
	  cnt++;
  }
    
  while (1 << (p - 1) < num) // checks for if the num is less than 2^n
  {
	  System.out.println("P: "+p);
	  System.out.println("1 << (p-1): "+ (1<<(p-1)));
	  
   if ((num & (1 << p)) != 0){//Checks if num has 1 in pos starting from 2,3,4
	   System.out.println("num & (1 << p): "+(num & (1 << p)));
	   cnt += (1 << (p - 1)) * (p) + num % (1 << p) + 1;
	   System.out.println("num:"+num +" 1<<p: "+(1<<p)+" num % (1 << p) : "+(num % (1 << p)));
	   System.out.println("Count : "+cnt);
	   System.out.println();	      
   }
   p++;
   System.out.println();	
  }
  return cnt;
 }

}