public class linear_search {
    
    public static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i; // return index
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        long start ,end;
        start = System.nanoTime();

        int result = linearSearch(arr, key);
        end = System.nanoTime();
        System.out.println(end-start+"ns");
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

