class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
        while (false) { // Unreachable while loop
            // This code is never executed
            System.out.println("This is unreachable code");
        }
    }
}