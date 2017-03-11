
public class LowestCommonAncestor
{

 /**
  * @param args
  */
 public static void main(String[] args)
 {

  Node a = new Node(1);
  Node b = new Node(2);
  Node c = new Node(3);
  Node d = new Node(4);
  Node e = new Node(5);
  Node f = new Node(8);
  Node g = new Node(6);
  Node h = new Node(7);
  a.left = b;
  a.right = c;
  b.left = d;
  c.left = e;
  c.right = f;
  f.left = g;
  f.right = h;
  LCA(a, c, h);
  System.out.println(LCANode.value);
  
    LCA(a, g, h);
  System.out.println(LCANode.value);
 }

 static Node LCANode = null;

 public static int LCA(Node currentNode, Node n1, Node n2)
 {
  if (currentNode == null)
   return 0;
  int currentValue = 0;
  if (currentNode == n1 || currentNode == n2)
   currentValue = 1;
  int leftValue = LCA(currentNode.left, n1, n2);
  int rightValue = LCA(currentNode.right, n1, n2);
  
  System.out.println("Out left Value: "+leftValue +" Current :"+currentNode.value);
  System.out.println("Out rightValue: "+rightValue+"Current :"+currentNode.value);
  
  /*
   * (currentValue == 1 && leftValue == 1) 
   * 	When one node is a parent of its left child
   * (currentValue == 1 && rightValue == 1)
   * (leftValue == 1 && rightValue == 1)
   *    both nodes are children to this node.
   */
  if ((currentValue == 1 && leftValue == 1)
     ||(currentValue == 1 && rightValue == 1)
     ||(leftValue == 1 && rightValue == 1))
  {
	  System.out.println("Current: "+currentValue);
	  System.out.println("left Value: "+leftValue);
	  System.out.println("rightValue: "+rightValue);
	  LCANode = currentNode;
   return 2; // Why 2? 2 of the 3 values are 1 here so 1+1=2;
  }
  System.out.println("Final Current: "+currentValue);
  System.out.println("Final left Value: "+leftValue);
  System.out.println("Final rightValue: "+rightValue);
  
  return currentValue + leftValue + rightValue;

 }
 
 
 static class Node
 {
  public Node left;
  public Node right;
  public int value;

  public Node(int value)
  {
   this.value = value;
  }
 }

}