import java.util.Scanner;

public class arrCreate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Read the size of the array
        int n = s.nextInt();
        
        // Initialize the array
        int[] arr = new int[n];
        
        // Read the values into the array
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        // Print the values of the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
        
}
}
