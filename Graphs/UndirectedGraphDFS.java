import java.util.*;

public class UndirectedGraphDFS {
    private Map<Integer, List<Integer>> adj = new HashMap<>();

    // Add edge between u and v (both directions)
    void addEdge(int u, int v) {
        adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS (Undirected): ");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");
        for (int neighbor : adj.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        UndirectedGraphDFS graph = new UndirectedGraphDFS();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        graph.dfs(1); // Output: 1 2 4 3
    }
}