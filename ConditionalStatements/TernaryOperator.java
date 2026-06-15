package ConditionalStatements;

class TernaryOperator{
    public static void main(String[] args)
    {
        int n  = 5;
        int result = 0;

        /*
        if(n%2 == 0)
            result = 10; //for even numbers print 10
        else
            result = 20;  //for odd numbers print 20
        System.out.println(result);
        */

        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);
    }
}