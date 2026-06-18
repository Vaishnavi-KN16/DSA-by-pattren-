import java.util.Scanner;

public class Dijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        // Using n+1 to safely use 1-based indexing for cities (1 to n)
        int[][] costMatrix = new int[n + 1][n + 1];
        int[] shortestDistances = new int[n + 1];
        boolean[] isVisited = new boolean[n + 1]; // boolean array defaults to false

        System.out.println("Enter the cost Matrix weights (use 999 for infinity):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                costMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the source vertex:");
        int source = sc.nextInt();

        // STEP 1: Initialize your distance notepad using the source row
        for (int i = 1; i <= n; i++) {
            shortestDistances[i] = costMatrix[source][i];
        }
        shortestDistances[source] = 0;
        isVisited[source] = true;

        // STEP 2: Main Dijkstra Loop (runs n-1 times)
        for (int count = 1; count < n; count++) {
            int minWeight = 999;
            int currentCity = -1;

            // Find the closest unvisited city from your notepad
            for (int i = 1; i <= n; i++) {
                if (!isVisited[i] && shortestDistances[i] < minWeight) {
                    minWeight = shortestDistances[i];
                    currentCity = i;
                }
            }

            // If we can't reach any more cities, stop
            if (currentCity == -1) break;

            // Lock this city in
            isVisited[currentCity] = true;

            // STEP 3: Shortcut Check (Update neighbors)
            for (int neighbor = 1; neighbor <= n; neighbor++) {
                if (!isVisited[neighbor]) {
                    int totalPathCost = shortestDistances[currentCity] + costMatrix[currentCity][neighbor];
                    
                    // If going through currentCity is cheaper, update your notepad
                    if (totalPathCost < shortestDistances[neighbor]) {
                        shortestDistances[neighbor] = totalPathCost;
                    }
                }
            }
        }

        // STEP 4: Print results
        System.out.println("Shortest paths from source " + source + ":");
        for (int i = 1; i <= n; i++) {
            if (i != source) {
                System.out.println("Path to " + i + " | Min Cost: " + shortestDistances[i]);
            }
        }
        sc.close();
    }
}