
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class yedekkosegenustunutoplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N değeri: ");
        int N = input.nextInt();
        int[][] A = new int[N][N];
        System.out.println("A matrisi: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(i + ". satır ve " + j + ".sütun: ");
                A[i][j] = input.nextInt();

            }

        }
        int t = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) <(N-1)) {
                    t += A[i][j];

                }

            }
        
        }
        System.out.println("Yedek köşegenin üstündeki elemanların toplamı: " + t);
    }
    
}
