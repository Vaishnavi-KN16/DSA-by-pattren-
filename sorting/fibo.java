import java.util.*;

public class fibo {
    public static int fibo( int n )
    {
       if(n<=1)
        return n;

        return fibo(n-1)+fibo(n-2);

    }
    public static void main( String[] args)
    {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.println(" no sequence");
        }
        for( int i=0;i<n;i++)
        {
            System.out.print(fibo(i)+" ");
        }
       
    }
    
}
/* a condition of handling n as 0 and n as 1 was a problem 
how to solve it 
1. in the for loop if where i<n when it comes to 0 , 0 <0 which is false and it will return nothing 
and for 1 ,1< 0 is true and it will print one number that is 0 
now if i make i<=n the n=0 will be handled but for n numbers n+1 fibo sequence will be printed 
hence , we add a if condition to handle n<=0 which would actually return some thing 
then now , what ids the use of n<=1 condition inside the func ?? 
  */
