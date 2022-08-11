public class SlidingWindowBForce {


    static int SlidingWindow(int arr[], int size, int k)
    {
        int max_sum = Integer.MIN_VALUE; //setting min value in max so that can return maximum value
        for(int i=0;i<size-k+1;i++) //3..for window size
        {
            int sum =0;
            for(int j=0;j<k;j++)
            {
                

                sum = sum + arr[i+j];
                //i=0
               //sum=0  ------
               //j=0
               //0=0+[0+0]
               //1=1+[0+1]
               //3=3+[0+2]
               //6
               //i=1
               //---------
               //j=0
               //sum=0
               //0=0+[1+0]
               //2=2+[1+1]
               //5=5+[1+2]
               //9
               //i=2
               //sum =0;
               //j=0
               //0=0+[2+0]
               //3=3+[2+1]
               //7=7+[2+2]
               //12
               //i=3
               //sum=0
               //0=0+[3+0]
               //4=4+[3+1]
               //9=9+[3+2]
               //15
               max_sum = Math.max(sum , max_sum);
            }
        }
        return max_sum;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int size = arr.length;
        int k = 3;
        System.out.print(SlidingWindow(arr, size,k));
    }
    
}
