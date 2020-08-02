class Main { 
  
static int josephus(int n, int k) { 
    if (n == 1) 
     return 1; 
     else
    /* The position returned by josephus(n - 1, k)  
    is adjusted because the recursive call  
    josephus(n - 1, k) considers the original  
    position k%n + 1 as position 1 */
    return (josephus(n - 1, k) + k-1) % n + 1; 
    
} 
  
// Driver Program to test above function 
public static void main(String[] args) { 

    int n = 5; // number of soldier
    int k = 3; 
    int winner = josephus(n, k); 
    
    System.out.println("The Number of  winner soldier is " + winner); 
    
        } 
    }
