package NYP;

import java.util.LinkedList;
import java.util.List;


class Node {
	int data;
	Node left;
	Node Right;
	Node(int data,Node left,Node Right){ //Construct Node
		this.data=data;
		this.left=left;
		this.Right=Right;
	}
	Node(int data){ //overload of Construct Node
		this.data=data;
		this.left=null;
		this.Right=null;
	}
	
	
	
}
class BTS {
	private  Node root;
	
	BTS(){
		root=null;
	}
	BTS(Node root){
		this.root=root;
	}
	
	void add(Node root,int data) {
		if(root==null) {
			root=new Node(data);
		return;
		}
		if(root.data<data){
			if(root.Right==null)
				root.Right=new Node(data);
			else
				add(root.Right,data);
		}
		if(root.data>data) {
			if(root.left==null)
				root.left=new Node(data);
			else
				add(root.left,data);	
		}
	}
	
	void add(Node root,Node new_node) {
		if(root==null) {
			root=new_node;
		return;
		}
		if(root.data<new_node.data){
			if(root.Right==null)
				root.Right=new_node;
			else
				add(root.Right,new_node);
		}
		if(root.data>new_node.data) {
			if(root.left==null)
				root.left=new_node;
			else
				add(root.left,new_node);
			
		}
		
	}
	
	//TO Read BTS
	 void printPostorder(Node node){  //left,right,root
         
         if (node == null)
         return;
         
         // first recur on left subtree
         printPostorder(node.left);
         // then recur on right subtree
         
         printPostorder(node.Right);
         
         // now deal with the node
         
         System.out.print(node.data + " ");
     }
     /* Given a binary tree, print
      its nodes in inorder*/
     void printInorder(Node node){  //left,root,right
         
         if (node == null)
         return;
         /* first recur on left child */
         
         printInorder(node.left);
         
         /* then print the data of node */
         
         System.out.print(node.data + " ");
         
         /* now recur on right child */
         
         printInorder(node.Right);
     }
     
     /* Given a binary tree, print
      
      its nodes in preorder*/
     
     void printPreorder(Node node){      //root,left,right
     
         if (node == null)  
         return;
       
         /* first print data of node */
         System.out.print(node.data + " ");
         /* then recur on left subtree */
         
         printPreorder(node.left);
         /* now recur on right subtree */
      
         printPreorder(node.Right);
     }
     // Wrappers over above recursive functions
     
     // This method mainly calls Postorder()
     void printPostorder(){
         printPostorder(root);
     }
     // This method mainly calls InorderRec()
     void printInorder(){
         printInorder(root);   
     }
     // This method mainly calls Preorder() 
     void printPreorder(){
         printPreorder(root);
     }
    
    private List<Integer>values=new LinkedList<Integer>();
 	private int step=0;
 	 List<Integer>FindPathBetween(Node root,int data){
 		while(root != null && root.data!=data) {
 			
 			if(root.data==data) {
 				if(!values.contains(root.data)) {
 				values.add(root.data);
 				step++;
 				}
 				else
 					step--;
 				return values;
 			}
 			
 			
 			if(root.data>data) {
 				if(!values.contains(root.data)) {
 					values.add(root.data);
 					step++;
 					}
 					else
 						step--;
 				
 				return FindPathBetween(root.left,data);
 			}
 			if(root.data<data)
 				if(!values.contains(root.data)) {
 					values.add(root.data);
 					step++;
 					}
 					else
 						step--;
 				return FindPathBetween(root.Right,data);
 		}
 		
 		return values;
 	}
 	 
 	 int findsteppath() {
 		return step;
 	}
 	
 	
	

}





public class main {
		
	public static void main(String[] args) {
		
		Node root=new Node(8);
		
		
		BTS bts1=new BTS(root);
		Node n2=new Node(5);
		Node n3=new Node(10);
		Node n4=new Node(4);
		Node n5=new Node(6);
		Node n6=new Node(9);
		Node n7=new Node(11);
		
		
		bts1.add(root,n2);
		bts1.add(root, n3);
		bts1.add(root, n4);
		bts1.add(root, n5);
		bts1.add(root, n6);
		bts1.add(root, n7); // *overload of add Node by Node
		bts1.add(root, 12);// *overload of add Node by data 
		
		
		System.out.println("Inorder");
		bts1.printInorder();
		System.out.println();

		
		System.out.println("preorder");
		bts1.printPreorder();
		System.out.println();

		System.out.println("posteorder");
		bts1.printPostorder();
		System.out.println();
    
    
    	List<Integer> list1=new LinkedList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
		//find the path Between Node(4) and Node(12)
		list1=bts1.FindPathBetween(root,n4.data);
		System.out.println("The path of Nodeofdata (4) is : "+list1.size());
		System.out.println("The Node have been visited to get Node of data (4) is : "+list1);
		
		list2=bts1.FindPathBetween(root,12);
		System.out.println("The path of Nodeofdata (12) is : "+bts1.findsteppath());
		System.out.println("The Node have been visited to get Node of data (12) is : "+list2);
	


	}

}
  
