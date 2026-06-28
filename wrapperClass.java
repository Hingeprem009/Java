public class wrapperClass 
{
    public static void main(String[] args)
    {
        int num = 4;
        Integer num1 = num; //autoboxing

        int num2 = num1;
        System.out.println(num2); //auto-unboxing

        String str = "11";
        int num3 = Integer.parseInt(str);

        System.out.println(num3*2); //22
    }
}