import java.util.Scanner;

public class MaxMin {

static int findMax(int[] arr, int low, int high) {
    if (low == high)
        return arr[low];

    int mid = (low + high) / 2;

    int leftMax = findMax(arr, low, mid);
    int rightMax = findMax(arr, mid + 1, high);

    return Math.max(leftMax, rightMax);
}

static int findMin(int[] arr, int low, int high) {
    if (low == high)
        return arr[low];

    int mid = (low + high) / 2;

    int leftMin = findMin(arr, low, mid);
    int rightMin = findMin(arr, mid + 1, high);

    return Math.min(leftMin, rightMin);
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    long start = System.nanoTime();

    int max = findMax(arr, 0, n - 1);
    int min = findMin(arr, 0, n - 1);

    long end = System.nanoTime();

    System.out.println("Maximum = " + max);
    System.out.println("Minimum = " + min);
    System.out.println("Time taken = " + (end - start) + " ns");
}
```

}
