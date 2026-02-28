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

        // Unreachable if statement - begin
        if (getCondition()) {
            // Code that is always unreachable
            if (false) {
                int n = 1;
            }
        }
        // Unreachable if statement - end
    }

    private static boolean getCondition() {
        // This method is used to return a non-compile-time constant
        // to avoid the "unreachable statement" error
        return Math.random() > 0.5;
    }
}