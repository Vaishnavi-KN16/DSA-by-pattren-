import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- STEP 1: GET INPUTS ---
        System.out.println("Enter number of items:");
        int n = sc.nextInt();

        System.out.println("Enter capacity:");
        int c = sc.nextInt();

        int[] p = new int[n + 1]; // Profits array
        int[] w = new int[n + 1]; // Weights array

        System.out.println("Enter profits:");
        for (int i = 1; i <= n; i++) p[i] = sc.nextInt();

        System.out.println("Enter weights:");
        for (int i = 1; i <= n; i++) w[i] = sc.nextInt();

        // DP Table: Rows = items (0 to n), Columns = capacities (0 to c)
        int[][] v = new int[n + 1][c + 1];

        // --- STEP 2: BUILD THE DP TABLE ---
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= c; j++) {
                
                // Base Case: If you have 0 items OR a bag capacity of 0, profit is 0
                if (i == 0 || j == 0) {
                    v[i][j] = 0;
                } 
                // Case A: The current item's weight fits inside our current capacity 'j'
                else if (w[i] <= j) {
                    // Decide: Is it better to SKIP the item, or TAKE it?
                    v[i][j] = Math.max(v[i - 1][j], p[i] + v[i - 1][j - w[i]]);
                } 
                // Case B: The item is too heavy to fit in a bag of capacity 'j'
                else {
                    v[i][j] = v[i - 1][j]; // Force skip: just take the old score from the row above
                }
            }
        }

        System.out.println("Maximum Profit = " + v[n][c]);

        // --- STEP 3: TRACEBACK (Find which items were chosen) ---
        System.out.print("Selected items: ");
        int i = n;
        int j = c;

        while (i > 0 && j > 0) {
            // If the profit changed from the row above, it means we MUST have packed item 'i'!
            if (v[i][j] != v[i - 1][j]) {
                System.out.print(i + " ");
                j = j - w[i]; // Reduce the remaining capacity of our bag
            }
            i--; // Move up to the next item row above
        }
        
        sc.close();
    }
}