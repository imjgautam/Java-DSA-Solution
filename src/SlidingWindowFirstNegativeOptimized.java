import java.util.LinkedList;

public class SlidingWindowFirstNegativeOptimized {
    
    static void FirstNegative(int arr[], int size, int k)
    {
        LinkedList<Integer> neg= new LinkedList<Integer>();
        //linked List is created to store all negative number 
        int i;
        for( i=0; i<k; i++)
        {
            if(arr[i]<0)
            {
                neg.add(i);
                //in this loop we get first negative in a first window size k=3.
                // if found then it will add back to the list
            }
        }
        for(i=k;i<size;i++) // this loop will run from window size to array size.
        {
            if(!neg.isEmpty())// this condition check if the list is empty or not
                                // if not then it goes it will peek front element of list
                                // that is the last window first negative number
                                // if thee list is empty that is true then it will go to
                                // else part and refelect zero ...
            {
                System.out.println(arr[neg.peek()]);
            }
            else
            {
                System.out.println("0");
            }
        
            while((!neg.isEmpty()) && (neg.peek()<(i-k+1))) 
            // this loop is for deleting the used element from the list.
            // it will check list should be non empty and list front element is less than i-k+1
            //if the while loop conditon matches
            // then list item will be removed.

            {
                neg.remove(); 
            }

            // after list is removed,  arr[i] will be checked to -ve number and when founded
            // then it will add back to vaccant list.
            if(arr[i]<0)
            {
                neg.add(i);
            }
        }

        // this is the condition for last window.
    
        if(!neg.isEmpty())
        {
            System.out.println(arr[neg.peek()]);
        }
        else
        {
            System.out.println("0");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,4,5,-6,7};
        int size = arr.length;
        int k = 3;
        FirstNegative(arr, size, k);
    }
}
