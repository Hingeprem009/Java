public class ArrayExe
{
    public static void main(String[] args)
    {
        int nums[] = new int[5];
        //Insert 
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = 1+i;
        }
        //Display
        for(int j = 0;j < nums.length; j++)
        {
            System.out.println(nums[j]);
        }
    }
}