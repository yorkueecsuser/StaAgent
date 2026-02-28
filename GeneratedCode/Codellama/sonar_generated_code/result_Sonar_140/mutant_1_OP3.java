class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        if (false) { // Unreachable if branch
            System.out.println("Unreachable");
        }
        System.out.println(i); // Outputs 0
    }
}