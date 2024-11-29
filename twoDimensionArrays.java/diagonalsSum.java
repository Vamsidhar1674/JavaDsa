public class diagonalsSum {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int c = 1;
        int m = 3;
        int n = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = c++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
       
        int sum = 0;
        int i = 0;
        int j = 0;
        int k = m - 1;

        while (i < m && k >= 0) {
            sum += arr[i][j];
            sum += arr[i][k];
            if (i == k) {
                sum -= arr[i][k];

            }
            i++;
            j++;
            k--;
        }
        System.out.println("Sum: "+ sum);

    }

}
