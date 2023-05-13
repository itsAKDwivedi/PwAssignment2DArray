import java.util.Scanner;
public class DiagonalCheck {
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
        System.out.print("arr[] = ");
        int arr[][] = new int[n][m];
        InputArray(arr, n, m);
        boolean result = true;
       for(int i=0; i<Math.min(n,m)-1; i++) {
            if(arr[i][i]!=arr[i+1][i+1]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
