class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0

// Start of Unreachable switch statement mutant
        switch (false) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            case 2:
                System.out.println("This code is also unreachable");
                break;
            default:
                System.out.println("This code is also unreachable");
                break;
        }
// End of Unreachable switch statement mutant
    }
}