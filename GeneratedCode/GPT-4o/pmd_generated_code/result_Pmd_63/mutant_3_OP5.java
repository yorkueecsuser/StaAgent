class NullAssignmentExample {

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        example.showBug();
    }

    public void showBug() {
        Object x = new Object();
        // Simulating some complex code here
        System.out.println("Object initialized: " + x);

        // Unnecessary null assignment
        x = null; // BUG: NullAssignment

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);

        // Mutation: Unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue(); // Method to ensure runtime determination
        switch (unreachableSwitchValue) {
            case 999: // This case is unreachable due to getUnreachableValue() never returning 999
                System.out.println("This message will never be printed.");
                break;
            default:
                // Default section, if needed, but keep it empty to maintain the mutation's intent
                break;
        }
    }

    private int getUnreachableValue() {
        return -1; // Always returns -1, making the switch case unreachable
    }
}