interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run : Fast");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
class interfaceDemo
{
    public static void main(String[] args)
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer prem = new Developer();
        prem.devApp(lap);
    }
}