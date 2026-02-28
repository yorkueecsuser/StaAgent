class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0

        // Mutated code added below:
        boolean unreachable = false;
        switch (unreachable) {
            case true:
                System.out.println("This case is unreachable");
                break;
            case false:
                System.out.println("This case is also unreachable");
                break;
            default:
                System.out.println("The default case is also unreachable");
                break;
        }
    }
}