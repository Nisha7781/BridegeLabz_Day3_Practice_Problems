class Largest
{
    public static void main(String args[])
    {
        int[] arr = {1, 3, 4, 9, 5, 6, 7};
        int max = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i] ;
            }
        }
            System.out.print("Largest in array is: " + max);
            
    
    }
}