public class Quick_sort {
    public static void swap ( int [] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr,int st,int end)
    {
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st + 1; i<=end; i++)
        {
            // this for loop find which number of element 
            // less than pivot find correct position of 
            // pivot
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap( arr, st, pivotIdx);
        // swap the pivot and pivotidx element;
        int i = st , j = end;
        while (i<pivotIdx && j>pivotIdx) {
            // entire logic inside the loop rearrange
            // the array  
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j]>pivot) {
                j--;
            }
            if(i<pivotIdx && j>pivotIdx)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        // throught this pivotidx dividing rearranging array
        return pivotIdx;
    }
    static void quickSort(int[] arr,int st ,int end)
    {
        if(st >= end) return;
        int pi = partition(arr, st, end);
        // this recurrance relation divide the 
        // array accordingly
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void printArray( int [] arr)
    {
        for( int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = { 7,13,8,5,10,2,4};
        int n = arr.length;
        Quick_sort obj = new Quick_sort();
        obj.quickSort(arr, 0, n-1);
        obj.printArray(arr);
        
    }
    
}
