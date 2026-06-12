import java.util.*;
public class Krushkal{
     static int[]parent = new int[20];
     static int find( int v ) 
     {
          while(parent[v]!=0)
               v=parent[v];
          return v;


     }
     static void union( int u, int v)
     {
          parent[v] =u;

     }
     public static void main(String[] args )
     {
          int n=0; 
          int edgecount=0  ;
          int mincost=0;
           Scanner sc = new Scanner(System.in);
          System.out.println( " enter number of vertices ");
          n = sc.nextInt();
          int[][] cost = new int [20][20];
          System .out.println(" enter the matrix");
          for( int i=1;i<=n;i++)
          {
               for( int j=1;j<=n;j++)
               {
                    cost[i][j]= sc.nextInt();

               }

          }
          while( edgecount < n-1)
          {
               int min = 999;
               int a =0;
               int b=0;
               for( int i=1;i<=n;i++)
               {
                    for( int j=1;j<=n;j++)
                    {
                         if(  cost[i][j]<min)
                         {
                              min = cost[i][j];
                              a=i;
                              b=j;
                         }


                    }
                    
               }
               int x=find(a);
               int y = find(b);
               if( x!=y)
               {
                    union(x,y);
                    System.out.println(a+"-"+b+"="+min);
                    edgecount++;
                    mincost+=min;
              

               }
               cost[a][b] = cost[b][a] = 999;

          }
                 System.out.println("Minimum Cost = " + mincost);



        sc.close();


     }
}