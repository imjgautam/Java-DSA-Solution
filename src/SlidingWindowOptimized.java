
public class SlidingWindowOptimized{

      static int slide_window(int arr[], int size, int k)
        {
            if(size<k)
            {
                System.out.println("Invalid ..");
                return -1;
            }
           // return -1; // -1 represent that the code execution terminated after invalid input.

            int max_summ = 0;  
            for(int i=0;i<k;i++)
            {
                max_summ = max_summ + arr[i];
                //0 = 0 + 1
                //1 = 1 + 2
                //3 = 3 + 3  >> 6
                
            }
                
            int window_size = max_summ;

            for(int i=k;i<size;i++)
            {
                window_size = window_size + arr[i] - arr[i-k];
                max_summ = Math.max(window_size, max_summ); 
                //Math is a class in java, and we can use Max & Min between two Int variable
                //we can access Max & min method by using dot. after Math Class (Math.Max(int a, int b))
            }

            
           // System.out.println(max_summ);
           return max_summ;
        }
    public static void main(String[] args){
      //  SlidingWindowOptimized sl = new SlidingWindowOptimized();
        int arr[] = {-1,-2,-3,-4,-5 };//1 2 3 >> -1 + 2 + 3 +4
        int k=3; //Window size for continuous subarray in an array
        int size=arr.length;
        System.out.println(slide_window(arr, size, k));
    }
}
 
