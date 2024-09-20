public class insertion_sort {
    public static int[] intsertion(int [] arr)
    {
        int n = arr.length;
        for(int i = 1 ;i<n; i ++)
        {
            int j = i;
            while (j>0 && arr[j]< arr[j-1]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{ 5,4,3,2,1};
        intsertion(arr);
        for(int num : arr)
       {
         System.out.print(num+" ");
       }
        
    }
    
}
