import java.util.Scanner;

public class Floyds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int n = sc.nextInt();

        // Safely size the array dynamically to match the exact number of nodes
        int[][] a = new int[n + 1][n + 1];

        System.out.println("Enter weighted matrix (Use 999 for infinity):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // --- THE FLOYD-WARSHALL CORE ---
        for (int k = 1; k <= n; k++) {         // Try every city 'k' as a middleman
            for (int i = 1; i <= n; i++) {     // Try every starting city 'i'
                for (int j = 1; j <= n; j++) { // Try every destination city 'j'
                    
                    // If path through 'k' is a shortcut, update the matrix
                    if (a[i][k] + a[k][j] < a[i][j]) {
                        a[i][j] = a[i][k] + a[k][j];
                    }
                    
                }
            }
        }

        // Print final output matrix
        System.out.println("\nShortest Path Matrix between all pairs:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}