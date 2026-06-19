public class AdvCalc extends BasCalc{   //AdvClac -> Sub class
                                        //BasCalc -> Super class & to Enharit we use extends keyword (is)
                                        // This is single level Inheritance BasCalc->AdvCalc
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}