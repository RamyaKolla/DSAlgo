package ramyaDS;

import java.util.PriorityQueue;

public class MergeNSortedArrays
{
 public static void main(String[] args)
 {
  int[]arr1={2,4,6,8,9,12,14,16};
  int[]arr2={3,6,7,9,22,25,28};
  int[]arr3={2,5,7,8,10,11,16};
  int[]arr4={4,8,23,26,28};
  int[]result=mergeNArrays(new int[][]{arr1,arr2,arr3,arr4});
  for(int i:result)
  {
   System.out.print(i+",");
  }
 }

 private static int[] mergeNArrays(int[][] sortedArrays)
 {
  int totalLength=0;
  PriorityQueue heap=new PriorityQueue();
  
  for(int i=0;i
 {
  private int startIndex;
  private int[]array;
  public ArrayContainer(int[]array)
  {
   this.array=array;
   startIndex=0;
  }
  public boolean isEmpty()
  {
   return startIndex==array.length;
  }
  public int peek()
  {
   return array[startIndex];
  }
  public int getNextInt()
  {
   return array[startIndex++];
  }
  @Override
  public int compareTo(ArrayContainer o)
  {
   return new Integer(peek()).compareTo(o.peek());
  }
  
 }
}