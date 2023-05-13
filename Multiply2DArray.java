import java.util.Scanner;
public class Multiply2DArray {
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
        
        System.out.print("n1 = ");
        int n1 = sc.nextInt();
        System.out.print("m1 = ");
        int m1 = sc.nextInt();
        System.out.print("arr1 = ");
        int arr1[][] = new int[n1][m1];
        InputArray(arr1, n1, m1);
        
        System.out.print("n2 = ");
        int n2 = sc.nextInt();
        if(m1!=n2) {
            System.out.println(-1);
            return;
        }
        System.out.print("m2 = ");
        int m2 = sc.nextInt();
        System.out.print("arr2 = ");
        int arr2[][] = new int[n2][m2];
        InputArray(arr2, n2, m2);
        
        int mul[][] = new int[n1][m2];
        for(int i=0; i<n1; i++) {
            for(int j=0; j<m2; j++) {
                for(int k=0; k<m1; k++) {
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0; i<n1; i++) {
            for(int j=0; j<m2; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
