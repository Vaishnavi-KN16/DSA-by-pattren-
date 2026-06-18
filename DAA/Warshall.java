import java.util.Scanner;

public class Warshall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int n = sc.nextInt();

        // Dynamically sized array to avoid size limits
        int[][] a = new int[n + 1][n + 1];

        System.out.println("Enter adjacency matrix (0s and 1s):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // --- THE WARSHALL CORE ---
        for (int k = 1; k <= n; k++) {         // k is the middleman
            for (int i = 1; i <= n; i++) {     // i is the starting city
                for (int j = 1; j <= n; j++) { // j is the destination
                    
                    // Logic: If there's already a path, OR a path through middleman 'k'
                    if (a[i][j] == 1 || (a[i][k] == 1 && a[k][j] == 1)) {
                        a[i][j] = 1;
                    }
                    
                }
            }
        }

        // Print reachability matrix
        System.out.println("\nTransitive Closure (Reachability Matrix):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}