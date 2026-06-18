
//
// Encapsulation:
//  Encapsulation is the process of hiding data by making variables private
//  and accessing them through public getter and setter methods.
//
// Use:
//  - Protects data from direct access.
//  - Allows data validation.
//  - Improves security.
//  - Makes code easier to maintain.
//

class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        Human obj = new Human();

        obj.setAge(19);
        obj.setName("Prem");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}