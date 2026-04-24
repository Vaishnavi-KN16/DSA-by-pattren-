// graph basic 
import java.util.*;

public class Graph{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //number of nodes
        int n= sc.nextInt();
        // number of edges 
        int m = sc.nextInt();
        // adjacency matrix
        int [][] adj = new int[n+1][n+1];
        for ( int i=0;i<m;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();

            /*  we are directly adding the nodes as the index, hence the array must be of n_+1 indexed , cz haveing an node of 5 , and 
                accessing the 5 th index of the array give us an error 
                ( this is not the major case because nodes aren't always in the range of 1 to n )
            */
            adj[u][v]=1;
            // for undireted graph 
            adj[v][u]=1;
            


        }
        for( int i=1;i<n;i++)
        {          
            for( int j=1;j<n;j++)
                System.out.print(adj[i][j] + " ");
                System.out.println();
        }
        sc.close();

    }
}