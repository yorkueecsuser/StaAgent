class NullParameterExample {

    public void printString(String str) {
        System.out.println(str.length());
    }

    public int showBug() {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code.");
        }
        
        printString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        return -1; // Return value is not relevant to the bug demonstration
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the if-else branches unreachable
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}