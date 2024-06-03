public class insertionSort {
    public static void main(String[] args) {
        int[] array={21,51,52,54,84,89};
        sort(array);
        for(Integer i:array){
            System.out.println(i);
        }
        
    }
    static void sort(int[]array){
        for(int i=1;i<array.length;i++){
            int curr=array[i];
            int prev= i-1;
            while(prev>=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;


            }
            array[prev+1]=curr;

        }

    }
    
}
