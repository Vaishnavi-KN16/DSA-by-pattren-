import java.util.*;


public class Graph_list {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);
        // number of nodes
        int n = sc.nextInt(); 
        // number of edges
        int m = sc.nextInt();
        ArrayList<Integer>[]  adj= new ArrayList[n+1];
        // every node has its own  list 
        for(int i=0;i<=n;i++)
        {
            adj[i]= new ArrayList<>();
        }
        
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Directed graph: edge from u to v
            adj[u].add(v); 
        }
    for (int i = 1; i <= n; i++) {
        System.out.print(i + " -> ");
        
        for (int j = 0; j < adj[i].size(); j++) {
            System.out.print(adj[i].get(j) + " ");
        }
        
        System.out.println();
    }   
    sc.close();

    }





    
}
