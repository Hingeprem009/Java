import java.util.*;

class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    // Without overriding toString(), Java prints the object's memory address.
    public String toString()
    {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class ListSort
{
    public static void main(String[] args)
    {
        //students are sorted by age in ascending order.
        Comparator<Student> com = new Comparator<Student>()
        {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age )
                    return 1;
                else if (i.age < j.age)
                    return -1;
                else
                    return 0;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(19,"Prem"));
        studs.add(new Student(18,"Ram"));
        studs.add(new Student(21,"Ajay"));
        studs.add(new Student(22,"Mayur"));  

        // Sort the list using the custom Comparator.
        Collections.sort(studs, com);

        for(Student s : studs)
            System.out.println(s);
    } 
}