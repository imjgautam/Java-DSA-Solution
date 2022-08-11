import java.util.Scanner;
public class ArraySum {
 

    int arraysum(int arr[], int size)
    {
        int temp = 0;
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                temp = temp + arr[j];
                i++;
            }
        }
            return temp;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //for taking inputs from user always we can use in any code
        int size = sc.nextInt(); //here for taking size.
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArraySum as = new ArraySum();
        
        System.out.println(as.arraysum(arr,size));

    }
}


