public class tower {

    public static void solve(int n, char from, char helper, char to) {
        
        // Base case
        if(n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Step 1: Move n-1 disks from source → helper
        solve(n - 1, from, to, helper);

        // Step 2: Move nth disk from source → destination
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Step 3: Move n-1 disks from helper → destination
        solve(n - 1, helper, from, to);
    }

    public static void main(String[] args) {
        int n = 3;  // number of disks
        solve(n, 'A', 'B', 'C');  // A = from  B = helper, C = to
    }
}