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

        // Unreachable switch statement
        int x = 1;
        int y = 2;
        switch (x) {
            case 1:
                y = 3;
                break;
            case 2:
                y = 4;
                break;
            default:
                y = 5;
                break;
        }
        System.out.println("y: " + y);
    }
}