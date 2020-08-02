// Java program for linked-list implementation of queue 
  
// A linked list (LL) node to store a queue entry 
class Node<T> { 
    T key; 
    Node<T> next; 
  
    // constructor to create a new linked list node 
    public Node(T key) 
    { 
        this.key = key; 
        this.next = null; 
    } 
} 

class Queue<T> { 
    Node<T> front, rear; 
  
    public Queue() 
    { 
        this.front = this.rear = null; 
    } 
  
    // Method to add an key to the queue. 
    void add(T key) 
    { 
  
        // Create a new LL node 
        Node<T> temp = new Node<>(key); 
  
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return; 
        } 
  
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp; 
    } 
  
    // Method to remove an key from queue. 
    void remove() 
    { 
        // If queue is empty, return NULL. 
        if (this.front == null) 
            return; 
  
        // Store previous front and move front one node ahead 
        Node temp = this.front; 
        this.front = this.front.next; 
  
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
            this.rear = null; 
    } 
    
    @Override
    public String toString(){
        String str = "";
        // Start from first node
        Node<T> current = this.front;
        // loop till last node
        while(current != null){
            str  = str + " "+ String.valueOf(current.key);
            current = current.next;
            
        }
        return str;
    }
} 
  
// Driver class 
public class Main { 
    public static void main(String[] args) 
    { 
        Queue<Integer> q = new Queue<>(); 
        q.add(10); 
        q.add(20); 
        q.remove(); 
        q.remove(); 
        q.add(30); 
        q.add(40); 
        q.add(50); 
        q.add(60);
        q.remove(); 
        System.out.println("Queue  : " + q);
        System.out.println("Queue Rear : " + q.front.key); 
        System.out.println("Queue Rear : " + q.rear.key); 
    } 
}
