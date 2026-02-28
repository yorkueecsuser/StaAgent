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
}

class UnreachableSwitchStatement {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
        
        // Unreachable switch statement
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("This code is unreachable");
                break;
            case false:
                System.out.println("This code is also unreachable");
                break;
        }
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
        
        // Unreachable switch statement
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("This code is unreachable");
                break;
            case false:
                System.out.println("This code is also unreachable");
                break;
        }
    }
}