import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
    
    public static void reversea(int arr[], int size)
    {
        Collections.reverse(Arrays.asList(arr));
        int temp=0;
        for(int i=0;i<size;i++)
        {
            for(int j=size-i-1;i<size/2;j--)
            {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        for(int i=0;i<size;i++)
         {
             System.out.println(arr[i]);
         }
        
    }
    public static void main(String[] args) 
    {
        
        int arr[] = {1,2,3,4,5}; 
        int size = 5;
        
         reversea(arr, size);
         
    }
    
}
