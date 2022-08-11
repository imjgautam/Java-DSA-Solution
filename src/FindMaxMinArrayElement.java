import java.util.Scanner;
public class FindMaxMinArrayElement {

     static class MaxMin{
        int Max;
        int Min;
        //we create class of MaxMin for two variable Max,Min.
        //so we can use max for maximum element and min for minimum element.
        //it also help to fix the max min element in variable. 
    }

    static MaxMin GetMaxMin(int arr[], int size)
    {
        MaxMin mm = new MaxMin(); //crete class object to access Max Min variable 
        // mm is a object of class MaxMin, it help to access the variable inside MaxMin class
            if(size==1)
            {
                mm.Max=arr[0];
                mm.Min=arr[0];
                return mm;
            }
                    // 2 1 3 4 5
                    //check sort
                    //2 6 8 5 3 0
                    //sort
                    //0 min
                    //size = max
            if(arr[0]>arr[1])
            {
                mm.Max=arr[0];
                mm.Min=arr[1];
            }
            else
            {
                mm.Max=arr[1];
                mm.Min=arr[0];
            }

            for(int i=2;i<size;i++)
            {
                if(arr[i]>mm.Max)
                {
                    mm.Max=arr[i];
                }
                else if(arr[i]<mm.Min)
                {
                    mm.Min=arr[i];
                }
            }
            return mm; //there is two variable inside mm object 1. Max 2. Min
            
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //to take size
        int arr[] = new int[size]; // to declare size in array
        for(int i=0;i<size;i++)
        {
          arr[i] = sc.nextInt();// to take input in array
        }

        MaxMin mm = GetMaxMin(arr, size);
        System.out.println("Maximum "+mm.Max);
        System.out.println("Minimum "+mm.Min);


    }

    
}
