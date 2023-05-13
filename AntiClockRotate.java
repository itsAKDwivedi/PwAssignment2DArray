import java.util.Scanner;
public class AntiClockRotate{
    static void InputArray(int arr[][] , int n , int m) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("matrix = ");
        int matrix[][] = new int[n][m];
        InputArray(matrix, n, m);
        
       for(int i=0; i<n; i++) {
            int low=0, high=n-1;
            while(low<high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
