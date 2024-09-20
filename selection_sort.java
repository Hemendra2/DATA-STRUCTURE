public class selection_sort {
    public static int[]  selection(int [] arr)
    {
         int n = arr.length;
         for(int i = 0; i<n; i++)// i represent the current index
         {
             int min_index = i ;
             for(int j = i + 1; j<n; j++)
             {// this loop check which index assingn minmun element 
                // in the given array
                if( arr[j]< arr[min_index])
                {
                    // throught this logic we will check
                    min_index = j;
                }
             }
             if(min_index != i)
             { // through this logic we perform swapping operation
                // between current index element and minmum element
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
             }
         }
         return arr;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{ 5,4,3,2,1};
        selection(arr);
       for(int num : arr)
       {
         System.out.print(num+" ");
       }
    }
    
}
