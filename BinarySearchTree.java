 class Node<T> {
	T data;
	Node<T> left, right;
	
	Node (T data){
		this.data = data;
		left = right = null;
	}
	
}

 
 class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    
    BinarySearchTree(){
        this.root = null;
    }
    

    void insert(T data) { 
       root = insertRec(this.root, data); 
    } 

   private Node<T> insertRec(Node<T> root, T data) { 
  
       
        if (root == null) { 
            root = new Node<T>(data); 
            return root; 
        } 
        
        int comparison = data.compareTo(root.data);
        
        if(comparison == 0)
        	return root;
        if (comparison < 0)
        	root.left = insertRec(root.left, data);
        if (comparison > 0)
        	root.right = insertRec(root.right, data);

        return root; 
    }
   
    private void inorderRec(Node<T> root) {
		if (root == null)
			return;
		inorderRec(root.left);
		System.out.print(root.data +" ");
		inorderRec(root.right);
		
	}
    
    void inorder() {
    	inorderRec(this.root);
    }
}

public class Main {
	
	static BinarySearchTree<Character> BST;
	static String Sentence;
	static char[] character;
	
	public static void main(String[] args) {
		BST = new BinarySearchTree<>();
	    Sentence = "the quick brown fox jumps over the lazy dog ";
	    Sentence = Sentence.replaceAll("\\s+", "");
	    character = Sentence.toCharArray();
	    for(char item : character) {
	    	BST.insert(item);
	    	}
	    BST.inorder();
	    }
	}

