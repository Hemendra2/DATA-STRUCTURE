public class Bubble_sort {
    static void bubblesort(int [] arr)
    {
        int n = arr.length;
        for(int i =0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])// this condition checking value is greter than or not
                {
                    // this logic swap the code
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{5,4,3,2,1};
        bubblesort(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        
    }
    
}
