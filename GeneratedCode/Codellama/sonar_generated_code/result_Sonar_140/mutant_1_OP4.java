class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        if (false) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println(i); // Outputs 0
        }
    }
}