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

        int n = -1;
        int p = - - -n;  // Noncompliant: equivalent to "-n"
        int q = ~~~n;    // Noncompliant: equivalent to "~n"
        int r = + +n;    // Noncompliant: equivalent to "n"

        boolean d = false;
        boolean e =!!!d;   // Noncompliant

        System.out.println("p: " + p);
        System.out.println("q: " + q);
        System.out.println("r: " + r);
        System.out.println("e: " + e);
    }
}