
import java.util.Stack;

public class SortStack
{
 public static void main(String[] args)
 {
  Stack<Integer> stack=new Stack<Integer>();
  stack.push(5);
  stack.push(3);
  stack.push(9);
  stack.push(2);
  stack.push(6);
  System.out.println(stack.toString());
  sort(stack);
  while(!stack.isEmpty())
  {
   System.out.println(stack.pop());
  }
 }

 static void sort(Stack<Integer> stack)
 {
  if (stack.isEmpty())
   return;
  Integer top = stack.pop();
  System.out.println("Sort Top: "+top);
  sort(stack);
  System.out.println("Sort Top: "+top +"    Stack: "+stack.toString());
  insertSorted(top, stack);
  return;
 }

 static void insertSorted(Integer top, Stack<Integer> stack)
 {
	 System.out.println("Top: "+top);
  if(stack.isEmpty() || stack.peek() > top)
  {
   stack.push(top);
   return;
  }
  Integer smaller = stack.pop();
  System.out.println("Insert Top: "+top +"    Stack: "+stack.toString());
  
  insertSorted(top, stack);
  stack.push(smaller);
  System.out.println(stack.toString());
 }
}