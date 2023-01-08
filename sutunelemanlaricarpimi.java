import java.util.Scanner;

public class sutunelemanlaricarpimi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N değeri: ");
        int N = input.nextInt();
        int[][] a = new int[N][N];
        int[] b = new int[N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                 System.out.print(i+". satır ve "+j+". sütun: ");
                a[i][j] = input.nextInt();
            }   
        }
        System.out.println("b dizisi:");
        
        for (int i = 0; i < N; i++) {
            b[i] = 1;
            for (int j = 0; j < N; j++) {
                b[i] *= a[i][j];
            }
            System.out.print(b[i]+" ");
        }
    }
}
