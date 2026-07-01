//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

interface A // makes method public bydeafult
{ 
    int age = 19; //final and static
    String area="Pune";
    void show();
    void config();
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in Config");
    }
}

public class interfaceEx
{
    public static void main(String[] args)
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
    }
}