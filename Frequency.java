class Frequency
{
    public static void main(String args[])
    {
        int[] arr = {1, 3, 5, 4, 5, 6, 1, 7, 3, 2};
        int[] frequency = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) 
        {
            int count = 1;
 
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    count++;
                    frequency[j] = -1; 
                }
            }
 
            if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }
 
        System.out.println("Element frequencies:");
 
        for (int i = 0; i < arr.length; i++) 
        {
            if (frequency[i] != -1) 
            {
                System.out.println("Element " + arr[i] + " occurs " + frequency[i] + " times");
            }
        }        
    }
}