import java.util.*;

public class SubsetSimple {

    static void solve(int i, int sum, int[] w, int d, String ans) {
                                            
        // if sum matches target
        if (sum == d) {
            System.out.println("Subset: " + ans);
            return;
        }

        // if index goes out OR sum becomes too big
        if (i == w.length || sum > d) {
            return;
        }

        // 1. TAKE the number
        solve(i + 1, sum + w[i], w, d, ans + w[i] + " ");

        // 2. DON'T take the number
        solve(i + 1, sum, w, d, ans);
    }

    public static void main(String[] args) {

        int[] w = {1, 2, 3, 4};
        int d = 5;

        solve(0, 0, w, d, "");
    }
} 