
record Alien (int id, String name) { }
public class RecordClass {
    public static void main(String[] args)
    {
        Alien a1 = new Alien(1, "Prem");
        Alien a2 = new Alien(2, "Mayur");
        System.out.println(a1.name());
        System.out.println(a1.equals(a2));
        System.out.println(a1);

    }
}