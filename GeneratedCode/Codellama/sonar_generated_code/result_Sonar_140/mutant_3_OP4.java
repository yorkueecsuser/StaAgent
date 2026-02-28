class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
        // Unreachable if-else statement mutant code
        if (false) {
            i = 0;
        } else {
            i = 1;
        }
    }
}