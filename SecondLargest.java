class SecondLargest
{
    public static void main(String args[])
    {
        int[] arr = {1, 3, 4, 9, 5, 6, 7};
        int largest = arr[0];
        int SecLargest = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            int n = arr[i];

            if(n > largest)
            {
                SecLargest = largest;
                largest = n;
            }
            else if(n > SecLargest && n < largest)
            {
                SecLargest = n;
            }

        }
            System.out.print("Second Largest in array is: " + SecLargest);
    }
}