
class Student{
    int rollno;
    String name;
    int marks;
}

public class StdArr
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Prem";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Mayur";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Sneha";
        s3.marks = 97;

        //Creating array of Students

        Student students[] = new Student[3]; //holding student references
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        /*for(int i=0; i<students.length; i++)
        {
            System.out.println(students[i].name + " : " + students[i].rollno + " : " + students[i].marks);
        }
        */

       //Using Enhanced For Loop

       for(Student std : students)
       {
            System.out.println(std.name + " : " + std.rollno + " : " + std.marks);
       }
    }
}