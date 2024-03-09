class ElementAtOdd
{
    public static void main(String args[])
    {
        int[] arr= {1, 2, 3, 4, 5, 6, 8, 9};
	    System.out.println("Numbers at odd positions in array:" );
        for(int i=1; i<arr.length; i=i+2)
        {
	        System.out.print(arr[i] + " ");
        } 
    }
}