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

        // Introducing a non-final variable to use in the switch statement
        int unreachableSwitchVariable = getUnreachableValue();

        // Unreachable switch statement
        switch (unreachableSwitchVariable) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                System.out.println("Default case also unreachable");
                break;
        }

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);
    }

    // Method to ensure switch condition is always false
    private int getUnreachableValue() {
        return 0; // Return a value that is never matched in the switch case
    }
}