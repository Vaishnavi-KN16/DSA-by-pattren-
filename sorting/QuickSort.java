public class QuickSort {
    static void quicksort( int[] arr, int low, int high )
    {
        if( low<high)
        {
            int pivotIndex= partition(arr,low,high);
            quicksort(arr,low,pivotIndex-1);
            quicksort(arr,pivotIndex+1,high);

        }
    }
    static int partition( int[] arr, int low,int high)
    {
        int i= low-1;
        int pivot = arr[high];
        for ( int j=low;j<high;j++)
            {
                if( arr[j]<=pivot)
                {
                    i++;
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]= temp;
                   
                }

            }
            int temp= arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
            return i+1;
        }
        public static void main( String[] args )
        {
            int [] arr={ 10,3,4,5,2,7,9,1};
            quicksort(arr,0,arr.length-1);
            for( int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }

        }
    
}
