class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
        
        // Adding an unreachable switch statement
        // The condition is dynamically determined to ensure no compile-time errors
        int switchCondition = getUnreachableSwitchCondition();
        switch (switchCondition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                break;
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    // Method to dynamically determine the switch condition
    private int getUnreachableSwitchCondition() {
        return 0; // This ensures the switch case above is never executed
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}