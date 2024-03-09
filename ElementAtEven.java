class ElementAtEven
{
    public static void main(String args[])
    {
        int[] C= {1, 2, 3, 4, 5, 6, 8, 9};
	    System.out.println("Numbers at even positions in array:" );
        for(int i=0; i<C.length; i=i+2)
        {
	        System.out.print(C[i] + " ");
        } 
    }
}