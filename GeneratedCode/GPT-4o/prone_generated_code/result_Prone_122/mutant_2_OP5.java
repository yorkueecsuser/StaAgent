class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        
        // Inserting unreachable switch statement
        int unreachableSwitchVariable = getUnreachableSwitchValue();
        switch (unreachableSwitchVariable) {
            case 999: // This case is unreachable because getUnreachableSwitchValue() never returns 999
                System.out.println("Unreachable code executed.");
                break;
            default:
                // Default case, not doing anything
                break;
        }
        
        return unboxedResult;
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }
    }
    
    // Method that always returns a value other than 999 to ensure the switch is unreachable
    private int getUnreachableSwitchValue() {
        return -1; // Always return a value that doesn't match any case
    }
}