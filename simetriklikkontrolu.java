
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class simetriklikkontrolu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("N değeri");
        int N = input.nextInt();
        int[][] a = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(i + ". satır ve " + j + ". sütun: ");
                a[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] == a[j][i]) {
                    System.out.println("Simetriktir. ");
                } else {
                    System.out.println("Simetrik değildir. ");
                }
            }
        }
    }
    
}
