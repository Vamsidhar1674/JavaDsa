
public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 5, 4, 9, 10, 15};
        sort(array);
        for (Integer i : array) {
            System.out.print(i+" ");
        }
    }

    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { 
                if (array[j] > array[j + 1]) {
                    swap(j, array);
                }
            }
        }
    }

    static void swap(int j, int[] array) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
}
