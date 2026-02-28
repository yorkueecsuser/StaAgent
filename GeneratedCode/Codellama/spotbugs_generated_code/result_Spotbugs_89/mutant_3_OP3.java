class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }

    // Mutant 1: Unreachable if statement
    public int showBugMutant1() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        if (false) {
            y = 0;
        }
        return y;
    }

    // Mutant 2: Unreachable while loop
    public int showBugMutant2() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        while (false) {
            y = 0;
        }
        return y;
    }

    // Mutant 3: Unreachable for loop
    public int showBugMutant3() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        for (int i = 0; false; i++) {
            y = 0;
        }
        return y;
    }

    // Mutant 4: Unreachable if-else statement
    public int showBugMutant4() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        if (false) {
            y = 0;
        } else {
            y = 1;
        }
        return y;
    }

    // Mutant 5: Unreachable switch statement
    public int showBugMutant5() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        switch (0) {
            case 1:
                y = 0;
                break;
            default:
                y = 1;
                break;
        }
        return y;
    }
}