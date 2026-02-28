class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // Inserting an unreachable switch statement
        int switchValue = getUnreachableSwitchValue();
        switch (switchValue) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            default:
                // Default case to ensure no compile-time errors
                break;
        }

        return result;
    }

    private int getUnreachableSwitchValue() {
        // Always returns a value that won't match any case
        return -1;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}