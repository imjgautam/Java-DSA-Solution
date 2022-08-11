public class SlidingWindowFirstNegative {

    //1,-2,-3,4,-5,6,-7,6,4,7,8
    //-2
    //-2
    //-3
    //-5
    //-5
    //0
    // if arr[i] ==-ve to cout<<arr[i]


static void SlidingNegative(int arr[], int size, int k)
{
boolean bool;
for(int i=0;i<size-k+1;i++)
{
bool = false;
for(int j=0;j<k;j++)
{
    if(arr[i+j]<0)
    {
        //0+0=1>0false
        //0+1=true

        System.out.println(arr[i+j]+" ");
        bool = true;
        break;
    }
}

if(bool!=true)
{
System.out.println("0");
}
}


}



public static void main(String[] args)
{
int arr[]={1,-2,9,7,8,-3,4,-5,6,7,-8};
int size=arr.length;
int k=3;
SlidingNegative(arr, size, k);

}

}

