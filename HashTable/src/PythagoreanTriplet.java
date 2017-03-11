import java.util.HashSet;

public class PythagoreanTriplet {

 public static void main(String[] args) {
  int[] arr = { 2, 3, 4, 6, 7, 12, 13, 15, 5, 17, 14, 22 };
  findPythagoreanTriplets(arr);
 }

 private static void findPythagoreanTriplets(int[] arr) {
  HashSet squares = new HashSet();
  for (int num : arr)
   squares.add((long) num * num);
  for (int i = 0; i < arr.length - 1; ++i)
   for (int j = i + 1; j < arr.length; ++j) {
    long square = (long) arr[i] * arr[i] + (long) arr[j] * arr[j];
    if (squares.contains(square)) {
     System.out.println(arr[i] + "," + arr[j] + ","
       + (long) Math.sqrt(square));
    }
   }
 }

}