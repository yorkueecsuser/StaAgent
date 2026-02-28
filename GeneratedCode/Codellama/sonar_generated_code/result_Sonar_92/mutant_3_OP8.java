class UnaryPrefixOperatorsBug {
    public static void main(String[] args) {
        int i = 1;
        int j = - - -i;  // Noncompliant: equivalent to "-i"
        int k = ~~~i;    // Noncompliant: equivalent to "~i"
        int m = + +i;    // Noncompliant: equivalent to "i"

        boolean b = false;
        boolean c =!!!b;   // Noncompliant

        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("m: " + m);
        System.out.println("c: " + c);
    }
}

class Renaming {
    public static void main(String[] args) {
        int x = 1;
        int y = - - -x;  // Noncompliant: equivalent to "-x"
        int z = ~~~x;    // Noncompliant: equivalent to "~x"
        int w = + +x;    // Noncompliant: equivalent to "x"

        boolean a = false;
        boolean b =!!!a;   // Noncompliant

        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);
        System.out.println("b: " + b);
    }
}