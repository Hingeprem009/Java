sealed class A permits B,C {

}

final class B extends A { //permited classes need to be final,sealed or non-sealed also note that they should extends that class

}

final class C extends A {

}

class D {

}

public class SealedEx {
    public static void main(String[] args)
    {

    }
}