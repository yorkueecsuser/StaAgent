class NullParameterExample {

    public void printString(String str) {
        System.out.println(str.length());
    }

    public int showBug() {
        boolean condition = getCondition(); // Dynamically determined condition
        switch (condition) { // Unreachable switch statement
            case true:
                System.out.println("This is unreachable");
                break;
            default:
                System.out.println("Also unreachable");
                break;
        }
        printString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        return -1; // Return value is not relevant to the bug demonstration
    }

    private boolean getCondition() {
        return false; // This method ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}