

public class LinearSearch {
    public static int linearSearch(int[]array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target)
            return i;

        }
        return -1;

    }
    public static void main(String[] args) {
        int[] array ={1,100,5,6,7,8};
        int target=100;
        int res=linearSearch(array, target);
        if(res!=-1)
        System.out.println(res+"element found");
        else
        System.out.println("element not found");
    }

    
    
}
