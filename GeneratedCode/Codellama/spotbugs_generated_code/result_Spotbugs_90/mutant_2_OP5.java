// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);

        // Unreachable switch statement mutation
        int value = getValue();
        switch(value) {
            case 0:
                // unreachable code
                System.out.println("This code is unreachable");
                break;
            case 1:
                // unreachable code
                System.out.println("This code is also unreachable");
                break;
            default:
                System.out.println("This code is reachable");
                break;
        }
    }

    // Method to get value for switch expression
    public static int getValue() {
        return 2;
    }
}