public class CalculatePower {
	 public static void main(String[] args)
	 {
	  int x = 4;
	  int y = 3;
	  long power = x;
	  long answer = 1;
	  int z = y;
	  int a = y;
	  
	  while (y != 0)
	  {
	   if ((y & 1) == 1)
	   {
	    answer *= power;
	   }
	   y >>= 1;
	   power *= power;
	  }
	  System.out.println(answer);
	 
	  
	  for(int p =1; p<x;p++)
	  {
		  a = a * z;
		  System.out.println("a: "+a +" z:"+z);
	  }
	  System.out.println("a: "+a);
	 }
	}
