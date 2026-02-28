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

        // Unreachable switch statement mutant code
        int value = getValue();
        switch(value) {
            case 0:
                System.out.println("This case is unreachable.");
                break;
            case 1:
                System.out.println("This case is also unreachable.");
                break;
            default:
                System.out.println("This default case is also unreachable.");
                break;
        }
    }

    // Helper method to get value for unreachable switch statement
    private static int getValue() {
        return 0;
    }
}