/*
 * Program: Constructor Example in Java
 *
 * Description:
 * This program demonstrates the use of constructors in Java.
 * It includes:
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Getter and Setter Methods
 *
 * Author: Prem Hinge
 */

class Human
{
    private int age;
    private String name;

    // Default Constructor
    public Human()
    {
        age = 19;
        name = "Prem";
    }

    // Parameterized Constructor
    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    // Getter for age
    public int getAge()
    {
        return age;
    }

    // Setter for age
    public void setAge(int age)
    {
        this.age = age;
    }

    // Getter for name
    public String getName()
    {
        return name;
    }

    // Setter for name
    public void setName(String name)
    {
        this.name = name;
    }
}

public class ConstructorDemo
{
    public static void main(String[] args)
    {
        // Object using Default Constructor
        Human obj1 = new Human();

        // Object using Parameterized Constructor
        Human obj2 = new Human(18, "Hinge");

        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}