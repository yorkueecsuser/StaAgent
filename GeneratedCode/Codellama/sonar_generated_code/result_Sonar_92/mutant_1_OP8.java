class UnaryPrefixOperatorsBug {
    public static void main(String[] args) {
        int x = 1;
        int y = - - -x;  // Noncompliant: equivalent to "-x"
        int z = ~~~x;    // Noncompliant: equivalent to "~x"
        int w = + +x;    // Noncompliant: equivalent to "x"

        boolean b = false;
        boolean d =!!!b;   // Noncompliant

        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);
        System.out.println("d: " + d);
    }
}