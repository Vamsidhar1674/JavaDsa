
public class selectionSort {

    public static void main(String[] args) {
        int[] array= {20,12,10,15,2};
        sort(array);
        for(Integer i:array){
            System.out.print(i+" ");
        }
        
    }
    static void sort(int[] array){
        
        for(int i=0;i<array.length;i++){
            int mini=i;
            for(int j=i;j<array.length;j++){
                if(array[j]<array[mini]){
                    mini=j;
                }
                
            }
            int temp=array[i];
            array[i]=array[mini];
            array[mini]=temp;
        }
    }
    
}