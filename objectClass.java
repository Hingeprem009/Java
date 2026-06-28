class Student // Every class in Java automatically extends Object
{
    String name = "Prem";

    // Overriding Object class
    public String toString()
    {
        return "Student Name : " + name;
    }
}

public class objectClass
{
    public static void main(String[] args)
    {
        Student obj = new Student();

        System.out.println(obj.toString());

        // Java automatically calls obj.toString()
        System.out.println(obj);

        // getClass() is inherited from Object class
        System.out.println(obj.getClass());

        System.out.println(obj.hashCode());

        Student obj2 = new Student();
        System.out.println(obj.equals(obj2)); // false because they are different objects

        // Object reference can store any object's address
        Object ref = obj;
        System.out.println(ref);

        // Even though we didn't write:
        // class Student extends Object
        // Java automatically does it for us.
    }
}