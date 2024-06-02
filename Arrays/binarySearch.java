import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=10;
        
        int[] array=new int[n];
        System.out.println("enter array values");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter target value");
        int k=sc.nextInt();
        int index=search(array,k);
        System.out.println(index);
    
    }
    static int search(int[] array, int k){
        int low=0,mid,high=array.length;
        mid=(low+high)/2;
        while(low<=high){
            if(array[mid]<k){
                mid=mid+1;
    
            }
            else if(array[mid]>k){
                mid=mid-1;
    
            }
            else{
                return mid;
            }


        }
        return -1;
        

    }
    
}
