class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
        if (false) {
            // unreachable code
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}