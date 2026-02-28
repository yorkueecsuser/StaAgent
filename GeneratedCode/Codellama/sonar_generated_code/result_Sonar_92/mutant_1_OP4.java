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

        // Unreachable if-else statement mutant
        if (1 == 1) {
            // Code within this branch will never be executed
            i = -i;
            j = ~i;
            k = i;
            m = -i;
            b = true;
            c = false;
        } else {
            // Code within this branch will never be executed
            i = i;
            j = j;
            k = k;
            m = m;
            b = b;
            c = c;
        }
    }
}