class Smallest
{
    public static void main(String args[])
    {
        int[] arr = {1, 3, 4, 9, 5, 6, 7};
        int min = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i] ;
            }
        }
            System.out.print("Largest in array is: " + min);   
    }
}