import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int[] array =new int[5];
        
        int maximum=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ener Array Values");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        System.out.println(maximum);
        
        
    }
    
}
