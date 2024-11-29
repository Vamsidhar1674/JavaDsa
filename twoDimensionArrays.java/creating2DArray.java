import java.util.Scanner;

/**
 * creating2DArray
 */
public class creating2DArray {

    public static void main(String[] args) {
        int[][] myArray = new int[3][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                myArray[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                System.out.print(myArray[i][j]+" ");
        
            }
            System.out.println();

        }
        


    }
}